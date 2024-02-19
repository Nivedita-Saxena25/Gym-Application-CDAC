package project.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import project.gym.dao.IClassSchedule;
import project.gym.dto.ClassScheduleDto.ClassScheduleDto;
import project.gym.dto.ClassScheduleDto.ClassScheduleResponseDto;
import project.gym.mapper.ClassScheduleMapper;
import project.gym.pojos.ClassSchedule;
import project.gym.services.IClassScheduleService;

public class ClassScheduleController {

	@Autowired
	private IClassScheduleService classScheduleService;

	@PostMapping
	public ResponseEntity<String> scheduleClass(@RequestBody ClassSchedule classSchedule) {
		// Save the class
		classScheduleService.saveClassSchedule(classSchedule);
		return new ResponseEntity<>("Class registered successfully", HttpStatus.OK);
	}

	@GetMapping
	public List<ClassScheduleResponseDto> getAllClasses() {
		List<ClassSchedule> classes = classScheduleService.getAllClassSchedules();
		return ClassScheduleMapper.classScheduleEntityListToResponseDtoList(classes);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClassScheduleResponseDto> updateClassById(@PathVariable Long id,
			@RequestBody ClassScheduleResponseDto classScheduleDto) {
		try {
			ClassSchedule updatedClass = classScheduleService.updateClassSchedule(id,
					ClassScheduleMapper.dtoToClassScheduleEntity(classScheduleDto));
			return ResponseEntity.ok(ClassScheduleMapper.classScheduleEntityToResponseDto(updatedClass));
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/byid/{id}")
	public ResponseEntity<ClassScheduleResponseDto> getClassById(@PathVariable Long id) {
		try {
			ClassSchedule classes = classScheduleService.getClassScheduleById(id);
			return ResponseEntity.ok(ClassScheduleMapper.classScheduleEntityToResponseDto(classes));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/byid/{id}")
	public ResponseEntity<String> deleteClass(@PathVariable Long id) {
		try {
			String result = classScheduleService.deleteClassSchedule(id);
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
