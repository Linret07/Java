package hw.hw6;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.List;

import hw.hw6.config.HibernateUtil;
import hw.hw6.model.Car;
import hw.hw6.model.CarType;
import hw.hw6.model.Word;

public class MainHw6 {
    public static void main(String[] args) {
        try (var sessionFactory = HibernateUtil.getSessionFactory()) {
            saveData(sessionFactory);

            try (Session session = sessionFactory.openSession()) {
                List<String> values = session
                        .createQuery("select w.value from Word w", String.class)
                        .getResultList();
                System.out.println("Word values: " + values);
            }
        }
    }

    private static void saveData(org.hibernate.SessionFactory sessionFactory) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.persist(new Word("Hibernate"));
            session.persist(new Word("Reflection"));
            session.persist(new Word("Annotations"));
            session.persist(new Car("Toyota Camry", CarType.SEDAN, 203,
                    new BigDecimal("32000.00"), 2024));
            transaction.commit();
        } catch (RuntimeException exception) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw exception;
        }
    }
}
