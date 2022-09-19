package org.example.repository;


import org.example.model.User;
import org.example.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {

    public User findById(int id) {
        return HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .get(User.class, id);
    }


    public void saveUser(User user) {
        Session session = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession();

        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }


    public User getuserByName (String name) {
        //доделается


        return null;
    }
}
