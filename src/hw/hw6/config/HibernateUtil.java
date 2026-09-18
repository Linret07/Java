package hw.hw6.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hw.hw6.model.Car;
import hw.hw6.model.Word;

public final class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory buildSessionFactory() {
        return new Configuration()
                .setProperty("hibernate.connection.driver_class", "org.h2.Driver")
                .setProperty("hibernate.connection.url", "jdbc:h2:file:./data/hw6;AUTO_SERVER=TRUE;NON_KEYWORDS=VALUE,YEAR")
                .setProperty("hibernate.connection.username", "sa")
                .setProperty("hibernate.connection.password", "")
                .setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect")
                .setProperty("hibernate.hbm2ddl.auto", "update")
                .setProperty("hibernate.show_sql", "true")
                .addAnnotatedClass(Word.class)
                .addAnnotatedClass(Car.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
