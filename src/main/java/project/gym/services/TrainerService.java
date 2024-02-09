package project.gym.services;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import project.gym.dao.ITrainer;
import project.gym.pojos.Trainer;

import java.util.List;

	@Service
	public class TrainerService implements ITrainerService {
		@Autowired
	    private final ITrainer trainerDAO;

	   
	    public TrainerService(ITrainer trainerDAO) {
	        this.trainerDAO = trainerDAO;
	    }

	    @Override
	    public Trainer getTrainerById(Long trainerId) {
	        return trainerDAO.findById(trainerId).orElse(null);
	    }

	    @Override
	    public List<Trainer> getAllTrainers() {
	        return trainerDAO.findAll();
	    }

	    @Override
	    public Trainer saveTrainer(Trainer trainer) {
	        return trainerDAO.save(trainer);
	    }

	    @Override
	    public void deleteTrainer(Long trainerId) {
	        trainerDAO.deleteById(trainerId);
	    }
	}


