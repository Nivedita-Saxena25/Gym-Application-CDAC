package project.gym.pojos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Setter
@Getter
@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED) // Set the access level
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "user_name", unique = true, nullable = false)
    private String username;
    
    @Column(name ="password", nullable = false)
    private String password;
    
	@Column(name = "address")
    private String address;

    @Column(name = "health_records")
    private String healthRecords;

    @Column(name = "registration_date")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    
    public Users() {
        username = "";
        password = "";
    }
    public Long getId() {
        return userID;
    }
    public Users getUserById(Long userId) {
        Users user = new Users();
        user.setUserID(userId);
        return user;
    }

  
    
}

