package project.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.gym.pojos.Login;
import project.gym.pojos.Users;
import project.gym.security.JwtHelper;
import project.gym.security.JwtRequest;
import project.gym.security.JwtResponse;
import project.gym.services.ILoginService;
import project.gym.services.IUsersService;
@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class LoginController {
	@Autowired
    private ILoginService userService;
	@Autowired
	private AuthenticationManager manager;
	@Autowired
	private JwtHelper helper;
	@Autowired
	private UserDetailsService userdetailservice;

    @PostMapping
	public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

		this.doAuthenticate(request.getUsername(), request.getPassword());

		Login userDetails = (Login) userdetailservice.loadUserByUsername(request.getUsername());
		String token = this.helper.generateToken(userDetails);
        
		JwtResponse response = JwtResponse.builder().jwtToken(token).email(userDetails.getUsername()).build();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
    
    private void doAuthenticate(String email, String password) {
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);
            System.out.println("Authentication successful!");
        } catch (BadCredentialsException e) {
            // Log the exception message for debugging
            e.printStackTrace();
            System.out.println("Authentication failed: Bad credentials");
            throw new BadCredentialsException("Invalid Username or Password!!");
        } catch (Exception e) {
            // Log any other exceptions
            e.printStackTrace();
            System.out.println("Authentication error: " + e.getMessage());
            throw new RuntimeException("Authentication error");
        }
    }


}
