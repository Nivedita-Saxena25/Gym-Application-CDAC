package project.gym.pojos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "memberships")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membership_id")
    private Long membershipID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @Column(name = "membership_type")
    private String membershipType;

    @Column(name = "registration_date")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @Column(name = "renewal_date")
    @Temporal(TemporalType.DATE)
    private Date renewalDate;

    @Column(name = "expiration_date")
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

    // Constructors, getters, and setters...

    public Membership() {
        // Default constructor
    }

    public Membership(Users user, String membershipType, Date registrationDate, Date renewalDate, Date expirationDate) {
        this.user = user;
        this.membershipType = membershipType;
        this.registrationDate = registrationDate;
        this.renewalDate = renewalDate;
        this.expirationDate = expirationDate;
    }

    public Long getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(Long membershipID) {
        this.membershipID = membershipID;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Additional methods, if needed
}

