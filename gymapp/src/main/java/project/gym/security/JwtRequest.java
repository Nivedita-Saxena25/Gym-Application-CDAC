package project.gym.security;

<<<<<<< HEAD
import lombok.Data;

@Data
public class JwtRequest {

	private String username;

	private String password;
=======

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import project.gym.pojos.UserType;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtRequest {

	private String username;
	
	private String password;
	
    private UserType userType;
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
}