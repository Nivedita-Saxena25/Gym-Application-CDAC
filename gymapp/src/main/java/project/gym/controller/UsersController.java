package project.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import project.gym.customException.UserHandledException;
import project.gym.dto.UsersDto.RegistrationRequestDto;
import project.gym.dto.UsersDto.UserResponseDto;
import project.gym.dto.UsersDto.Userdto;
import project.gym.mapper.UserMapper;
import project.gym.pojos.Users;
import project.gym.services.IUsersService;
import project.gym.utils.JwtUtils;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class UsersController {
	@Autowired
    private IUsersService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;  // Inject the PasswordEncoder bean

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody Users user) {
        // Encode the password before saving
        user.setPassword(encodePassword(user.getPassword()));

        // Save the user
        userService.saveUser(user);
        
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
