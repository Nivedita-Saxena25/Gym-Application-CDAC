package project.gym.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import project.gym.customException.InvalidRegistrationException;
import project.gym.dto.TrainerDto.RegistrationRequestDto;
import project.gym.dto.TrainerDto.TrainerResponseDto;
import project.gym.pojos.Trainer;
@Component
public class TrainerMapper {

	public static Trainer dtoToTrainerEntity(RegistrationRequestDto registrationRequestDto) {
		if (registrationRequestDto == null || registrationRequestDto.getTrainerdto() == null) {
			throw new InvalidRegistrationException("Invalid trainer DTO: TrainerDto is null");
		}

		// Validate required fields
		if (StringUtils.isEmpty(registrationRequestDto.getUsername())
				|| StringUtils.isEmpty(registrationRequestDto.getPassword())) {
			throw new InvalidRegistrationException("Invalid trainer DTO: Missing required fields");
		}

		Trainer trainer = new Trainer();

		// Set trainer details from TrainerDto
		trainer.setUsername(registrationRequestDto.getUsername());
		trainer.setPassword(registrationRequestDto.getPassword());
		

		return trainer;
	}

	public static TrainerResponseDto trainerEntityToDto(Trainer trainerEntity) {
		if (trainerEntity == null) {
			throw new IllegalArgumentException("Trainer entity cannot be null");
		}

		TrainerResponseDto dto = new TrainerResponseDto();

		// Map entity fields to DTO
		dto.setTrainerID(trainerEntity.getTrainerID());
		dto.setFirstName(trainerEntity.getFirstName());
		dto.setLastName(trainerEntity.getLastName());
		dto.setEmail(trainerEntity.getEmail());

		return dto;
	}

	public static TrainerResponseDto trainerEntityToResponseDto(Trainer trainerEntity) {
		if (trainerEntity == null) {
			throw new IllegalArgumentException("Trainer entity cannot be null");
		}

		TrainerResponseDto responseDto = new TrainerResponseDto();

		// Map entity fields to response DTO
		responseDto.setTrainerID(trainerEntity.getTrainerID());
		responseDto.setFirstName(trainerEntity.getFirstName());
		responseDto.setLastName(trainerEntity.getLastName());
		responseDto.setEmail(trainerEntity.getEmail());

		// You can add more mapping logic here if needed

		return responseDto;
	}

	public static List<TrainerResponseDto> trainerEntityListToResponseDtoList(List<Trainer> trainers) {
		return trainers.stream().map(TrainerMapper::trainerEntityToResponseDto).collect(Collectors.toList());
	}
}
