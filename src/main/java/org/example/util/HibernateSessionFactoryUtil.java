package org.example.util;

import org.example.model.Car;
import org.example.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory ;

    private HibernateSessionFactoryUtil() {}


    public static  SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            try{

            // начало конфигурации
            Configuration configuration = new Configuration().configure();

            // указываем классы под регуляцию hibernet
            configuration.addAnnotatedClass(Car.class);
            configuration.addAnnotatedClass(User.class);


                // это создание настроек для сессии
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings((configuration.getProperties()));

                // пример
//                User user = new User().builder ()
//                        .id(213)
//                        .build();

                // даём условия сессии
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {

            }
        }
        return sessionFactory;
    }


}
