package hw.hw5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

import hw.hw5.course.Course;
import hw.hw5.course.StudentCourse;
import hw.hw5.student.Student;

public class MainHw5 {
    private static final Path DATA_DIRECTORY = Path.of("src", "hw", "hw5", "data");
    private static final Path TEXT_DIRECTORY = DATA_DIRECTORY.resolve("text");
    private static final Path STUDENTS_DIRECTORY = DATA_DIRECTORY.resolve("students");
    private static final Path COURSES_DIRECTORY = DATA_DIRECTORY.resolve("courses");

    public static void main(String[] args) throws IOException {
        readTextFile();
        printStudentsSortedByAge();
        combineStudentsAndCourses();
    }

    private static void readTextFile() throws IOException {
        Path textFile = TEXT_DIRECTORY.resolve("text.txt");

        System.out.println("=== Текстовий файл ===");
        Files.readAllLines(textFile, StandardCharsets.UTF_8)
                .forEach(System.out::println);
    }

    private static void printStudentsSortedByAge() throws IOException {
        Path studentsFile = STUDENTS_DIRECTORY.resolve("students-by-age.txt");

        List<Student> students = Files.readAllLines(studentsFile, StandardCharsets.UTF_8)
                .stream()
                .filter(line -> !line.isBlank())
                .map(MainHw5::parseStudent)
                .sorted(Comparator.comparingInt(Student::getAge))
                .toList();

        System.out.println("\n=== Студенти за віком ===");
        students.forEach(System.out::println);
    }

    private static void combineStudentsAndCourses() throws IOException {
        Path studentsFile = STUDENTS_DIRECTORY.resolve("students.txt");
        Path coursesFile = COURSES_DIRECTORY.resolve("courses.txt");
        Path resultFile = COURSES_DIRECTORY.resolve("students-with-courses.txt");

        List<Course> courses = Files.readAllLines(coursesFile, StandardCharsets.UTF_8)
                .stream()
                .filter(line -> !line.isBlank())
                .map(MainHw5::parseCourse)
                .toList();

        List<String> result = Files.readAllLines(studentsFile, StandardCharsets.UTF_8)
                .stream()
                .filter(line -> !line.isBlank())
                .map(MainHw5::parseStudentCourse)
                .map(student -> formatStudentCourse(student, courses))
                .toList();

        Files.write(resultFile, result, StandardCharsets.UTF_8);

        System.out.println("\n=== Студенти та їхні курси ===");
        result.forEach(System.out::println);
        System.out.println("Результат записано у файл: " + resultFile);
    }

    private static Student parseStudent(String line) {
        String[] values = line.split(";", -1);
        if (values.length != 3) {
            throw new IllegalArgumentException("Неправильний формат студента: " + line);
        }
        return new Student(values[0], Integer.parseInt(values[1]), values[2]);
    }

    private static StudentCourse parseStudentCourse(String line) {
        String[] values = line.split(";", -1);
        if (values.length != 3) {
            throw new IllegalArgumentException("Неправильний формат студента: " + line);
        }
        return new StudentCourse(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]));
    }

    private static Course parseCourse(String line) {
        String[] values = line.split(";", -1);
        if (values.length != 2) {
            throw new IllegalArgumentException("Неправильний формат курсу: " + line);
        }
        return new Course(Integer.parseInt(values[0]), values[1]);
    }

    private static String formatStudentCourse(StudentCourse student, List<Course> courses) {
        Course course = courses.stream()
                .filter(item -> item.getId() == student.getCourseId())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "Курс не знайдено: " + student.getCourseId()));
        return student.getId() + ". " + student.getName() + " — " + course.getName();
    }
}
