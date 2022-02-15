import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
      Transaction transaction=session.beginTransaction();
        Person person=new Person(123,"brad","Nashik","49343434");
        session.save(person);
        transaction.commit();







    }

}
