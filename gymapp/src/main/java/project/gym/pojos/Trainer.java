package project.gym.pojos;

import java.util.Collection;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Entity
@Table(name = "trainers")
@Data
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainer_id")
	private Long trainerID;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "shift_schedule")
	private String shiftSchedule;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "user_name", unique = true, nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@ManyToOne
	@JoinColumn(name = "attendance_id")
	private Attendance attendance;

}
