<<<<<<< HEAD
//package project.gym.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.*;
//import project.gym.customException.HandledException;
//import project.gym.dto.UsersDto.RegistrationRequestDto;
//import project.gym.dto.UsersDto.UserResponseDto;
//import project.gym.dto.UsersDto.Userdto;
//import project.gym.mapper.UserMapper;
//import project.gym.pojos.Users;
//import project.gym.security.JwtHelper;
//import project.gym.security.JwtRequest;
//import project.gym.security.JwtResponse;
//import project.gym.services.IUsersService;
//import project.gym.utils.JwtUtils;
//
//@RestController
//@RequestMapping("/customer")
//@CrossOrigin("*")
//public class UsersController {
//	@Autowired
//    private IUsersService userService;
//	@Autowired
//	private UserDetailsService userDetailsService;
//	@Autowired
//	private AuthenticationManager manager;
//	@Autowired
//	private JwtHelper helper;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;  
//    @PostMapping("/login")
//	public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {
//
//		this.doAuthenticate(request.getUsername(), request.getPassword());
//
//		Users userDetails = (Users) userService.loadUserByUsername(request.getUsername());
//		String token = this.helper.generateToken(userDetails);
//
//		JwtResponse response = JwtResponse.builder().jwtToken(token).firstName(userDetails.getFirstName()).build();
//		return new ResponseEntity<>(response, HttpStatus.OK);
//	}
//    
// // helper method for authentication
// 	private void doAuthenticate(String email, String password) {
// 		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
// 		try {
// 			manager.authenticate(authentication);
//
// 		} catch (BadCredentialsException e) {
// 			throw new BadCredentialsException(" Invalid Username or Password  !!");
// 		}
// 	}
//    @PostMapping
//    public ResponseEntity<String> registerUser(@RequestBody Users user) {
//        // Encode the password before saving
//        user.setPassword(encodePassword(user.getPassword()));
//
//        // Save the user
//        userService.saveUser(user);
//        
//        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
//    }
//
//    private String encodePassword(String plainTextPassword) {
//        return passwordEncoder.encode(plainTextPassword);
//    }
//
//
//
//    @GetMapping
//    public List<UserResponseDto> getUsers() {
//        List<Users> users = userService.getAllUsers();
//        return UserMapper.userEntityListToUserResponseDtoList(users);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<UserResponseDto> updateUserById(@PathVariable int id, @RequestBody RegistrationRequestDto updatedUserDto) {
//        try {
//            Users updatedUser = userService.updateUser(id, UserMapper.dtoToCustomerEntity(updatedUserDto));
//            return ResponseEntity.ok(UserMapper.userEntityToUserResponseDTO(updatedUser));
//        } catch (Exception e) {
//            throw new HandledException("Failed to update user");
//        }
//    }
//
//    @GetMapping("/byid/{id}")
//    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id) {
//        try {
//            Users user = userService.getUserById(id);
//            return ResponseEntity.ok(UserMapper.userEntityToUserResponseDTO(user));
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @DeleteMapping("/byid/{id}")
//    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
//        try {
//            String result = userService.deleteUser(id);
//            return ResponseEntity.ok(result);
//        } catch (Exception e) {
//            throw new HandledException("failed to delete");
//        }
//    }
//    @GetMapping("/decode-jwt")
//    public void decodeJwt(@RequestParam("token") String token) {
//        JwtUtils.decodeJwt(token);
//    }
//}
=======
package project.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import project.gym.customException.UserHandledException;
import project.gym.dto.UsersDto.RegistrationRequestDto;
import project.gym.dto.UsersDto.UserResponseDto;
import project.gym.mapper.UserMapper;
import project.gym.pojos.Attendance;
import project.gym.pojos.Booking;
import project.gym.pojos.ClassSchedule;
import project.gym.pojos.DietPlan;
import project.gym.pojos.FeedbackAndSurveys;
import project.gym.pojos.HealthAndFitnessTracking;
import project.gym.pojos.Login;
import project.gym.pojos.Users;
import project.gym.security.JwtHelper;
import project.gym.services.IUsersService;
import project.gym.utils.JwtUtils;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class UsersController {
	@Autowired
    private IUsersService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;  
    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody Users user) {
        // Encode the password before saving
        user.setPassword(encodePassword(user.getPassword()));
        Login login = user.createLoginEntity(user, passwordEncoder);
        HealthAndFitnessTracking healthTracking = user.createHealthTrackingEntity();
        DietPlan dietplan = user.createDietPlanEntity();
        FeedbackAndSurveys feedback= user.createFeedbackAndSurveysEntity();
        Booking booking = user.createBookingEntity();
        Attendance attendence = user.createAttendanceEntity();
        ClassSchedule classschedule = user.createClassScheduleEntity();
        // Save the user
        userService.saveUser(user);
        userService.saveUserAndLoginWithOtherEntities(user,
                login,
                healthTracking,dietplan,feedback,booking,attendence, classschedule);
        
        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
    }

    private String encodePassword(String plainTextPassword) {
        return passwordEncoder.encode(plainTextPassword);
    }



    @GetMapping
    public List<UserResponseDto> getUsers() {
        List<Users> users = userService.getAllUsers();
        return UserMapper.userEntityListToUserResponseDtoList(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDto> updateUserById(@PathVariable int id, @RequestBody RegistrationRequestDto updatedUserDto) {
        try {
            Users updatedUser = userService.updateUser(id, UserMapper.dtoToCustomerEntity(updatedUserDto));
            return ResponseEntity.ok(UserMapper.userEntityToUserResponseDTO(updatedUser));
        } catch (Exception e) {
            throw new UserHandledException("Failed to update user");
        }
    }

    @GetMapping("/byid/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id) {
        try {
            Users user = userService.getUserById(id);
            return ResponseEntity.ok(UserMapper.userEntityToUserResponseDTO(user));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/byid/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        try {
            String result = userService.deleteUser(id);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            throw new UserHandledException("failed to delete");
        }
    }
    @GetMapping("/decode-jwt")
    public void decodeJwt(@RequestParam("token") String token) {
        JwtUtils.decodeJwt(token);
    }
}
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
