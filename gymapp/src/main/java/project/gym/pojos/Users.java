package project.gym.pojos;
<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED) // Set the access level
@Entity
@Table(name = "users")
@Data
public class Users implements UserDetails{

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
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

  
    
}

=======

import lombok.Data;

import javax.persistence.*;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "health_records")
    private String healthRecords;

    @Column(name = "registration_date")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @OneToMany(mappedBy = "user")
    private List<Membership> memberships;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Set<Login> logins = new HashSet<>();


    @OneToMany(mappedBy = "user")
    private List<Attendance> attendances;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "user")
    private List<HealthAndFitnessTracking> trackings;

    @OneToMany(mappedBy = "user")
    private List<FeedbackAndSurveys> surveys;


    public Users() {
        email = "";
        password = "";
    }

    public Long getUserId() {
        return userId;
    }

    public Users getUserById(Long userId) {
        Users user = new Users();
        user.setUserId(userId);
        return user;
    }

        public Login createLoginEntity(Users user, PasswordEncoder passwordEncoder) {
            Login login = new Login();

            // Assuming user.getEmail() is the unique identifier for the user
            login.setUsername(user.getEmail());

            // Assuming you have a PasswordEncoder bean injected
            String hashedPassword = passwordEncoder.encode(user.getPassword());
            login.setPassword(hashedPassword);

            // Generate a random UUID for each login
            login.setUuid(UUID.randomUUID());

            return login;
        }

    public HealthAndFitnessTracking createHealthTrackingEntity() {
        HealthAndFitnessTracking tracking = new HealthAndFitnessTracking();
        // Set properties if needed
        return tracking;
    }
    
    public FeedbackAndSurveys createFeedbackAndSurveysEntity() {
        FeedbackAndSurveys feedbackAndSurveys = new FeedbackAndSurveys();
        // Set properties if needed
        return feedbackAndSurveys;
    }
    public DietPlan createDietPlanEntity() {
        DietPlan dietPlan = new DietPlan();
        return dietPlan;
    }
    public Attendance createAttendanceEntity() {
        Attendance attendance = new Attendance();
        // Set properties if needed
        return attendance;
    }
    public ClassSchedule createClassScheduleEntity() {
        ClassSchedule classSchedule = new ClassSchedule();
        // Set properties if needed
        return classSchedule;
    }
    public Booking createBookingEntity() {
        Booking booking = new Booking();
        // Set properties if needed
        return booking;
    }

}
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
