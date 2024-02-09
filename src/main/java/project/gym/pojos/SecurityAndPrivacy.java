package project.gym.pojos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "security_and_privacy")
public class SecurityAndPrivacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id")
    private Long securityID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "transaction_id")
    private String transactionID; // Assuming transactionID is of String type

    @Column(name = "security_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date securityDate;

    @Column(name = "security_details")
    private String securityDetails;

    // Constructors, getters, and setters...

    public SecurityAndPrivacy() {
        // Default constructor
    }

    public SecurityAndPrivacy(Users user, String transactionID, Date securityDate, String securityDetails) {
        this.user = user;
        this.transactionID = transactionID;
        this.securityDate = securityDate;
        this.securityDetails = securityDetails;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public void setSecurityID(Long securityID) {
        this.securityID = securityID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public Date getSecurityDate() {
        return securityDate;
    }

    public void setSecurityDate(Date securityDate) {
        this.securityDate = securityDate;
    }

    public String getSecurityDetails() {
        return securityDetails;
    }

    public void setSecurityDetails(String securityDetails) {
        this.securityDetails = securityDetails;
    }

    // Additional methods, if needed
}
