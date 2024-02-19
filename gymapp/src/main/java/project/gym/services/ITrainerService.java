package project.gym.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import project.gym.pojos.Trainer;

public interface ITrainerService{
	Trainer getTrainerById(Long trainerId);

	List<Trainer> getAllTrainers();

	Trainer saveTrainer(Trainer trainer);

	String deleteTrainer(Long trainerId);

	Trainer updateTrainer(Long trainerId, Trainer updatedTrainer);
}
