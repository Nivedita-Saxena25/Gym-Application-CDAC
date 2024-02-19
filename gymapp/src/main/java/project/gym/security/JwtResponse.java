package project.gym.security;

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
