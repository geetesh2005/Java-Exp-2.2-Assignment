import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = new Student();
        s.setName("Nidhi");
        s.setCourse("Java");

        session.save(s);
        tx.commit();

        System.out.println("Record Inserted Successfully!");
        session.close();
    }
}
