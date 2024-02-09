package project.gym.services;

import java.util.List;

import project.gym.pojos.Users;

public interface IUsersService {
	Users getUserById(Long userId);

	List<Users> getAllUsers();

	Users registerUser(Users user);

	void deleteUser(Long userId);

	Users updateUser(Long userId, Users updatedUser);

	//boolean authenticateUser(String username, String password);
}
