package project.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.gym.pojos.Users;
import project.gym.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/{userId}")
	public ResponseEntity<Users> getUserById(@PathVariable Long userId) {
		Users user = userService.getUserById(userId);
		return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
	}

	@GetMapping
	public ResponseEntity<List<Users>> getAllUsers() {
		List<Users> users = userService.getAllUsers();
		return ResponseEntity.ok(users);
	}

	@PostMapping
	public ResponseEntity<Users> saveUser(@RequestBody Users user) {
		Users savedUser = userService.registerUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}

	@PutMapping("/{userId}")
	public ResponseEntity<Users> updateUser(@PathVariable Long userId, @RequestBody Users updatedUser) {
		Users user = userService.updateUser(userId, updatedUser);
		return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
		return ResponseEntity.noContent().build();
	}
}
