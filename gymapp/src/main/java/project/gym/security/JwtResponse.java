package project.gym.security;
<<<<<<< HEAD

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtResponse {

	private Long userId;
	private String firstName;
	private String jwtToken;
	private String lastName;
	private String address;
	private String contactNumber;
	private String email;
	private String healthRecords;
	private LocalDate registrationDate;
}
=======
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {

		 private Long userId;
		    private String firstName;
			private String jwtToken;
		    private String lastName;
		    private String address;
		    private String contactNumber;
		    private String email;
		    private String healthRecords;
		    private LocalDate registrationDate;
	}

>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
