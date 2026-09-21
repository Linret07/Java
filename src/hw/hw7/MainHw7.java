package hw.hw7;

import hw.hw7.config.HibernateUtil;
import hw.hw7.model.Course;
import hw.hw7.model.Department;
import hw.hw7.model.Employee;
import hw.hw7.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MainHw7 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory()) {
            Long studentId = saveStudentsAndCourses(sessionFactory);
            printStudentById(sessionFactory, studentId);
            printStudentsOnCourse(sessionFactory, "Java Hibernate");

            saveEmployeesAndDepartments(sessionFactory);
            printEmployeesFromDepartment(sessionFactory, "IT");
            printEmployeesWithSalaryFrom(sessionFactory, new BigDecimal("2000"));
        }
    }

    private static Long saveStudentsAndCourses(SessionFactory sessionFactory) {
        AtomicReference<Long> savedStudentId = new AtomicReference<>();

        inTransaction(sessionFactory, session -> {
            Course java = new Course("Java Hibernate", "Hibernate and JPA basics");
            Course databases = new Course("Databases", "SQL and relational databases");

            Student anna = new Student("Anna", 20);
            Student oleksii = new Student("Oleksii", 22);
            Student maria = new Student("Maria", 21);

            anna.addCourse(java);
            oleksii.addCourse(java);
            oleksii.addCourse(databases);
            maria.addCourse(databases);

            session.persist(java);
            session.persist(databases);
            session.persist(anna);
            session.persist(oleksii);
            session.persist(maria);

            savedStudentId.set(anna.getId());
        });

        return savedStudentId.get();
    }

    private static void printStudentById(SessionFactory sessionFactory, Long id) {
        try (Session session = sessionFactory.openSession()) {
            Student student = session.get(Student.class, id);

            if (student == null) {
                System.out.println("Student with id " + id + " was not found");
                return;
            }

            System.out.println("Student by id: " + student);
        }
    }

    private static void printStudentsOnCourse(SessionFactory sessionFactory, String courseName) {
        try (Session session = sessionFactory.openSession()) {
            List<Student> students = session.createQuery(
                            "select distinct s from Student s "
                                    + "join s.courses c "
                                    + "where c.name = :courseName "
                                    + "order by s.name",
                            Student.class)
                    .setParameter("courseName", courseName)
                    .getResultList();
            System.out.println("Students on course '" + courseName + "': " + students);
        }
    }

    private static void saveEmployeesAndDepartments(SessionFactory sessionFactory) {
        inTransaction(sessionFactory, session -> {
            Department it = new Department("IT");
            Department hr = new Department("HR");

            session.persist(it);
            session.persist(hr);
            session.persist(new Employee("Andrii", new BigDecimal("3200"), it));
            session.persist(new Employee("Olena", new BigDecimal("2400"), it));
            session.persist(new Employee("Iryna", new BigDecimal("1800"), hr));
        });
    }

    private static void printEmployeesFromDepartment(SessionFactory sessionFactory, String departmentName) {
        try (Session session = sessionFactory.openSession()) {
            List<Employee> employees = session.createQuery(
                            "select e from Employee e where e.department.name = :departmentName",
                            Employee.class)
                    .setParameter("departmentName", departmentName)
                    .getResultList();
            System.out.println("Employees from department '" + departmentName + "': " + employees);
        }
    }

    private static void printEmployeesWithSalaryFrom(SessionFactory sessionFactory, BigDecimal minimumSalary) {
        try (Session session = sessionFactory.openSession()) {
            List<Employee> employees = session.createQuery(
                            "select e from Employee e where e.salary >= :minimumSalary order by e.name desc",
                            Employee.class)
                    .setParameter("minimumSalary", minimumSalary)
                    .getResultList();
            System.out.println("Employees with salary >= " + minimumSalary + ": " + employees);
        }
    }

    private static void inTransaction(SessionFactory sessionFactory,
                                      java.util.function.Consumer<Session> action) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            action.accept(session);
            transaction.commit();
        } catch (RuntimeException exception) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw exception;
        }
    }
}
