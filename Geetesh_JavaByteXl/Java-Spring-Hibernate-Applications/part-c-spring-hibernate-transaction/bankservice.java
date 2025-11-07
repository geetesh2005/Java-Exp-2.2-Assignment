import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@service
public class bankservice {

    @Autowired
    private SessionFactory factory;

    @Transactional
    public void transferMoney(int fromAcc, int toAcc, double amount) {
        Session session = factory.getCurrentSession();

        Account sender = session.get(Account.class, fromAcc);
        Account receiver = session.get(Account.class, toAcc);

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        session.update(sender);
        session.update(receiver);
    }
}
