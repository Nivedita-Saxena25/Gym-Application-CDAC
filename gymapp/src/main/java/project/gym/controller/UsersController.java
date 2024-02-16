package project.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.gym.customException.UserHandledException;
import project.gym.pojos.Users;
import project.gym.services.IUsersService;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class UsersController {

	@Autowired
	private IUsersService userService;
	
	
	//to save users
	@PostMapping
	public Users RegisterUser(@RequestBody Users user) {
	    return userService.saveUser(user);
	}

	@GetMapping
	public List<Users> getUsers() {
		return userService.getAllUsers();
	}

	@PutMapping("/{id}")
	public Users updateuserById(@PathVariable int id, @RequestBody Users updatedUser) {
		return userService.updateUser(id, updatedUser);
	}

	@GetMapping("/byid/{id}")
	public ResponseEntity<?> getUserbyId(@PathVariable Long id) {
		try {
			return ResponseEntity.ok(userService.getUserById(id));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@PutMapping("/byid/{id}")
    public Users updateUserbyId(@PathVariable int id, @RequestBody Users updatedUser) {
        try {
            return userService.updateUser(id, updatedUser);
        } catch (Exception e) {
            throw new UserHandledException("Failed to update user");
        }
    }

	@DeleteMapping("/byid/{id}")
	public String deleteUser(@PathVariable Long id) {
		try {
			return userService.deleteUser(id);
		} catch (Exception e) {
			throw new UserHandledException("failed to delete");
		}
	}
}
