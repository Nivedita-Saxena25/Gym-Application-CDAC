package project.gym.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import project.gym.pojos.Users;

public interface IUsersService extends UserDetailsService  {
    Users getUserById(Long userId);

    List<Users> getAllUsers();

    Users saveUser(Users user);

    String deleteUser(Long id);

	Users updateUser(int id, Users updatedUser);
}

