package project.gym.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

<<<<<<< HEAD
import project.gym.pojos.Users;

public interface IUsersService extends UserDetailsService  {
    Users getUserById(Long userId);

    List<Users> getAllUsers();

    Users saveUser(Users user);

    String deleteUser(Long id);

	Users updateUser(int id, Users updatedUser);
=======
import project.gym.pojos.Attendance;
import project.gym.pojos.Booking;
import project.gym.pojos.ClassSchedule;
import project.gym.pojos.DietPlan;
import project.gym.pojos.FeedbackAndSurveys;
import project.gym.pojos.HealthAndFitnessTracking;
import project.gym.pojos.Login;
import project.gym.pojos.Users;

public interface IUsersService   {
    Users getUserById(Long userId);

    List<Users> getAllUsers();

    void saveUser(Users user);

    String deleteUser(Long id);

	Users updateUser(int id, Users updatedUser);
	
	void saveUserAndLoginWithOtherEntities(
            Users user,
            Login login,
            HealthAndFitnessTracking healthTracking,
            DietPlan dietPlan,
            FeedbackAndSurveys feedbackAndSurvey,
            Booking booking,
            Attendance attendance,
            ClassSchedule classSchedule);
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
}

