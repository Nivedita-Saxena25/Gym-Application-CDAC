package project.gym.services;

import java.util.List;

import project.gym.pojos.Trainer;

public interface ITrainerService {
	Trainer getTrainerById(Long trainerId);

    List<Trainer> getAllTrainers();

    Trainer saveTrainer(Trainer trainer);

    void deleteTrainer(Long trainerId);
}
