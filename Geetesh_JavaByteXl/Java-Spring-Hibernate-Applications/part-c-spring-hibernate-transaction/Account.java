import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    private int accNo;
    private String holderName;
    private double balance;

    // Getters and Setters
}
