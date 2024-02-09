package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.gym.dao.IUsers;
import project.gym.pojos.Users;
import java.util.List;

@Service
public class UserService implements IUsersService {
	@Autowired
	private final IUsers usersDAO;

	public UserService(IUsers usersDAO) {
		this.usersDAO = usersDAO;
	}

	@Override
	public Users getUserById(Long userId) {
		return usersDAO.findById(userId).orElse(null);
	}

	@Override
	public List<Users> getAllUsers() {
		return usersDAO.findAll();
	}

	@Override
	public Users registerUser(Users user) {
		// Check if the user already exists
		if (usersDAO.findByEmail(user.getEmail()) != null) {
			throw new RuntimeException("User with the same email already exists");
		}

		// Save the new user
		return usersDAO.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		usersDAO.deleteById(userId);
	}

	@Override
	public Users updateUser(Long userId, Users updatedUser) {
		Users existingUser = usersDAO.findById(userId).orElse(null);
		if (existingUser != null) {

			existingUser.setFirstName(updatedUser.getFirstName());
			existingUser.setLastName(updatedUser.getLastName());
			existingUser.setContactNumber(updatedUser.getContactNumber());
			existingUser.setEmail(updatedUser.getEmail());
			existingUser.setAddress(updatedUser.getAddress());

			return usersDAO.save(existingUser);
		}
		return null;
	}

//	@Override
//	public boolean authenticateUser(String username, String password) {
//		return usersDAO.existsByUsernameAndPassword(username, password);
//	}
}
