package project.gym.dto.ClassScheduleDto;

import java.util.Date;

import lombok.Data;

@Data
public class ClassScheduleResponseDto {
	private Long classID;
	private String className;
	private Date scheduleDate;
	private Date startTime;
	private Date endTime;

}
