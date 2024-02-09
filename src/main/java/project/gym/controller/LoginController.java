//package project.gym.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import project.gym.pojos.Users;
//import project.gym.services.UserService;
//
//
//@RestController
//@RequestMapping("/api/login")
//public class LoginController {
//
//	private final UserService loginService;
//
//    @Autowired
//    public LoginController(UserService loginService) {
//        this.loginService = loginService;
//    }
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<String> authenticateUser(@RequestBody Users user) {
//        boolean isAuthenticated = loginService.authenticateUser(user.getUsername(), user.getPassword());
//        if (isAuthenticated) {
//            return ResponseEntity.ok("User authenticated successfully");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }
//}
