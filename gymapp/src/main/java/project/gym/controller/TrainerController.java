package project.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.gym.dto.TrainerDto.RegistrationRequestDto;
import project.gym.dto.TrainerDto.TrainerResponseDto;
import project.gym.mapper.TrainerMapper;
import project.gym.pojos.Trainer;
import project.gym.services.ITrainerService;

import java.util.List;

@RestController
@RequestMapping("/trainer")
@CrossOrigin("*")
public class TrainerController {

	@Autowired
	private ITrainerService trainerService;

	@PostMapping("/reg_trainer")
	public ResponseEntity<String> registerTrainer(@RequestBody Trainer trainer) {
		// Save the trainer
		trainerService.saveTrainer(trainer);
		return new ResponseEntity<>("Trainer registered successfully", HttpStatus.OK);
	}

	@GetMapping
	public List<TrainerResponseDto> getTrainers() {
		List<Trainer> trainers = trainerService.getAllTrainers();
		return TrainerMapper.trainerEntityListToResponseDtoList(trainers);
	}

	@PutMapping("/{id}")
	public ResponseEntity<TrainerResponseDto> updateTrainerById(@PathVariable Long id,
			@RequestBody RegistrationRequestDto updatedTrainerDto) {
		try {
			Trainer updatedTrainer = trainerService.updateTrainer(id,
					TrainerMapper.dtoToTrainerEntity(updatedTrainerDto));
			return ResponseEntity.ok(TrainerMapper.trainerEntityToResponseDto(updatedTrainer));
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/byid/{id}")
	public ResponseEntity<TrainerResponseDto> getTrainerById(@PathVariable Long id) {
		try {
			Trainer trainer = trainerService.getTrainerById(id);
			return ResponseEntity.ok(TrainerMapper.trainerEntityToResponseDto(trainer));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/byid/{id}")
	public ResponseEntity<String> deleteTrainer(@PathVariable Long id) {
		try {
			String result = trainerService.deleteTrainer(id);
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
