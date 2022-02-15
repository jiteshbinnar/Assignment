import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainAppEmployee {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Laptop laptop = new Laptop();
        laptop.setCpu("i7");
        Employee employee = new Employee();
        employee.setEmployeeId(123);
        employee.setDepartmentName("Associate Enginner");
        employee.setLaptop(laptop);
        session.save(laptop);
        session.save(employee);
        transaction.commit();

    }
}