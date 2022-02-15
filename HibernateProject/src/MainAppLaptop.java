import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class MainAppLaptop {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Laptop laptop=new Laptop(12,"326","fd343","984938d",new Date());
        session.save(laptop);
        transaction.commit();

        Query query = session.createQuery("FROM Laptop");
        ((org.hibernate.query.Query) query).setString("name", "Tarkesh");
        List lst=((org.hibernate.query.Query) query).list();
        for(Object obj:lst){
            System.out.println(obj);
        }
    }
    }
