package project.gym.customException;

public class UserNotFoundException extends RuntimeException {
	    public UserNotFoundException(String message) {
	        super(message);
	    }
}
