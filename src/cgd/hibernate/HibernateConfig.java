package cgd.hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateConfig {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            
            sessionFactory = new AnnotationConfiguration().configure("/cgd/hibernate/Hibernate.cfg.xml").buildSessionFactory();
            Session session = sessionFactory.openSession(); 
            Transaction tx = session.beginTransaction();
            tx.commit();
            session.close();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
