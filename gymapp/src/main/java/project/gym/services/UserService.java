package project.gym.services;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import project.gym.dao.IUsers;
import project.gym.pojos.Users;

import java.util.List;

	@Service
	public class UserService  implements IUsersService {
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
	    public Users saveUser(Users user) {
	        return usersDAO.save(user);
	    }

	    @Override
	    public void deleteUser(Long userId) {
	        usersDAO.deleteById(userId);
	    }
	}

