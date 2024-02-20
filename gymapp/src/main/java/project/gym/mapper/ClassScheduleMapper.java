package project.gym.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import project.gym.customException.InvalidRegistrationException;
import project.gym.dto.ClassScheduleDto.ClassScheduleResponseDto;
import project.gym.pojos.ClassSchedule;
@Component
public class ClassScheduleMapper {

	public static ClassSchedule dtoToClassScheduleEntity(ClassScheduleResponseDto classScheduleResponseDto) {
		if (classScheduleResponseDto == null) {
			throw new InvalidRegistrationException("Invalid class schedule DTO: ClassScheduleRequestDto is null");
		}

		// Validate required fields
		if (StringUtils.isEmpty(classScheduleResponseDto.getClassName())
				|| StringUtils.isEmpty(classScheduleResponseDto.getScheduleDate())
				|| StringUtils.isEmpty(classScheduleResponseDto.getStartTime())
				|| StringUtils.isEmpty(classScheduleResponseDto.getEndTime())) {
			throw new InvalidRegistrationException("Invalid class schedule DTO: Missing required fields");
		}

		ClassSchedule classSchedule = new ClassSchedule();

		// Set class schedule details from ClassScheduleRequestDto

		classSchedule.setClassName(classScheduleResponseDto.getClassName());
		classSchedule.setScheduleDate(classScheduleResponseDto.getScheduleDate());
		classSchedule.setStartTime(classScheduleResponseDto.getStartTime());
		classSchedule.setEndTime(classScheduleResponseDto.getEndTime());

		return classSchedule;
	}

	public static ClassScheduleResponseDto classScheduleEntityToResponseDto(ClassSchedule classScheduleEntity) {
		if (classScheduleEntity == null) {
			throw new IllegalArgumentException("ClassSchedule entity cannot be null");
		}

		ClassScheduleResponseDto responseDto = new ClassScheduleResponseDto();

		// Map entity fields to response DTO
		responseDto.setClassID(classScheduleEntity.getClassID());
		responseDto.setClassName(classScheduleEntity.getClassName());
		responseDto.setScheduleDate(classScheduleEntity.getScheduleDate());
		responseDto.setStartTime(classScheduleEntity.getStartTime());
		responseDto.setEndTime(classScheduleEntity.getEndTime());

		// You can add more mapping logic here if needed

		return responseDto;
	}

	public static List<ClassScheduleResponseDto> classScheduleEntityListToResponseDtoList(
			List<ClassSchedule> classSchedules) {
		return classSchedules.stream().map(ClassScheduleMapper::classScheduleEntityToResponseDto)
				.collect(Collectors.toList());
	}
}
