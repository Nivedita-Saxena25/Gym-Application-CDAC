package project.gym.mapper;

import org.springframework.stereotype.Component;

import project.gym.dto.AttendanceDto.AttendanceDto;
import project.gym.pojos.Attendance;
import project.gym.pojos.Users;
import project.gym.services.UserService;
@Component
public class AttendanceMapper {

    private final UserService userService;

    public AttendanceMapper(UserService userService) {
        this.userService = userService;
    }

    public AttendanceDto entityToDto(Attendance attendance) {
        AttendanceDto dto = new AttendanceDto();
        dto.setId(attendance.getAttendanceID());
<<<<<<< HEAD
        dto.setUserId(attendance.getUser().getUserID());
=======
        dto.setUserId(attendance.getUser().getUserId());
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
        dto.setCheckInTime(attendance.getCheckInTime());
        dto.setCheckOutTime(attendance.getCheckOutTime());
        dto.setStatus(attendance.getStatus());
        return dto;
    }

    public Attendance dtoToEntity(AttendanceDto dto) {
        Attendance attendance = new Attendance();
        attendance.setAttendanceID(dto.getId());

        // Use the injected UserService to call the non-static method
        Users user = userService.getUserById(dto.getUserId());

        attendance.setUser(user);
        attendance.setCheckInTime(dto.getCheckInTime());
        attendance.setCheckOutTime(dto.getCheckOutTime());
        attendance.setStatus(dto.getStatus());
        return attendance;
    }
}
