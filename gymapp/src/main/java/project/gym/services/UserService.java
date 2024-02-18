package project.gym.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import project.gym.customException.UserNotFoundException;
import project.gym.dao.IUsers;
import project.gym.pojos.Users;

import java.util.List;
import java.util.Optional;

	@Service
	public class UserService  implements IUsersService {
		@Autowired
	    private final IUsers usersDAO;

	    
	    public UserService(IUsers usersDAO) {
	        this.usersDAO = usersDAO;
	    }

	    public Users getUserById(Long userId) {
	        return usersDAO.findById(userId).orElse(null);
	    }
	    
	    @Override
	    public List<Users> getAllUsers() {
	        return usersDAO.findAll();
	    }

	    // create user
	    @Override
	    public Users saveUser(Users user) {
	        return usersDAO.save(user);
	    }

	    @Override
	    public String deleteUser(Long userId) {
	    		try {
	    			usersDAO.deleteById(userId);
	    			
	    			return "User with ID " + userId + " has been deleted.";
	    		} catch (EmptyResultDataAccessException e) {
	    			throw new RuntimeException("User not found with ID: " + userId);
	    		} catch (DataAccessException e) {
	    			throw new RuntimeException("Error deleting user with ID: " + userId, e);
	    		}
	    	}
	    
	    public Users updateUser(int id, Users updatedUser) {
	        Optional<Users> optionalUser = usersDAO.findById((long) id);

	        if (optionalUser.isPresent()) {
	            Users existingUser = optionalUser.get();

	            if (updatedUser.getFirstName() != null && !updatedUser.getFirstName().isEmpty()) {
	                existingUser.setFirstName(updatedUser.getFirstName());
	            }
	            if (updatedUser.getLastName() != null && !updatedUser.getLastName().isEmpty()) {
	                existingUser.setLastName(updatedUser.getLastName());
	            }
	            if (updatedUser.getAddress() != null && !updatedUser.getAddress().isEmpty()) {
	                existingUser.setAddress(updatedUser.getAddress());
	            }
	            if (updatedUser.getContactNumber() != null && !updatedUser.getContactNumber().isEmpty()) {
	                existingUser.setContactNumber(updatedUser.getContactNumber());
	            }
	            if (updatedUser.getEmail() != null && !updatedUser.getEmail().isEmpty()) {
	                existingUser.setEmail(updatedUser.getEmail());
	            }
	            if (updatedUser.getHealthRecords() != null && !updatedUser.getHealthRecords().isEmpty()) {
	                existingUser.setHealthRecords(updatedUser.getHealthRecords());
	            }
	            if (updatedUser.getRegistrationDate() != null) {
	                existingUser.setRegistrationDate(updatedUser.getRegistrationDate());
	            }
	            


	            return usersDAO.save(existingUser);
	        } else {
	            throw new UserNotFoundException("User not found with ID: " + id);
	        }
	    }
	    
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			return null;
		}

	}

