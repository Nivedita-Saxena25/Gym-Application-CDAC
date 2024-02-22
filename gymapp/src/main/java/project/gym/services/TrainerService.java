package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import project.gym.customException.NotFoundException;
import project.gym.dao.ITrainer;
import project.gym.pojos.Trainer;

import java.util.List;
import java.util.Optional;

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
	public String deleteTrainer(Long trainerId) {

		try {
			trainerDAO.deleteById(trainerId);

			return "Trainer with ID " + trainerId + " has been deleted.";
		} catch (EmptyResultDataAccessException e) {
			throw new RuntimeException("Trainer not found with ID: " + trainerId);
		} catch (DataAccessException e) {
			throw new RuntimeException("Error deleting Trainer with ID: " + trainerId, e);
		}
	}

	@Override
	public Trainer updateTrainer(Long trainerId, Trainer updatedTrainer) {
		Optional<Trainer> optionalTrainer = trainerDAO.findById((long) trainerId);
		if (optionalTrainer.isPresent()) {
			Trainer existingTrainer = optionalTrainer.get();
			if (updatedTrainer.getFirstName() != null && !updatedTrainer.getFirstName().isEmpty()) {
				existingTrainer.setFirstName(updatedTrainer.getFirstName());
			}
			if (updatedTrainer.getLastName() != null && !updatedTrainer.getLastName().isEmpty()) {
				existingTrainer.setLastName(updatedTrainer.getLastName());
			}
			if (updatedTrainer.getEmail() != null && !updatedTrainer.getEmail().isEmpty()) {
				existingTrainer.setEmail(updatedTrainer.getEmail());
			}
			if (updatedTrainer.getShiftSchedule() != null && !updatedTrainer.getShiftSchedule().isEmpty()) {
				existingTrainer.setEmail(updatedTrainer.getShiftSchedule());
			}
			if (updatedTrainer.getPassword() != null && !updatedTrainer.getPassword().isEmpty()) {
				existingTrainer.setEmail(updatedTrainer.getPassword());
			}

			return trainerDAO.save(existingTrainer);
		} else {
			throw new NotFoundException("Trainer not found with ID: " + trainerId);
		}
	}

}
