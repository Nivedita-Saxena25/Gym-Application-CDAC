package project.gym.mapper;

import java.sql.Date;
import java.time.ZoneId;

import project.gym.dto.UsersDto.UserResponseDto;
import project.gym.dto.UsersDto.Userdto;
import project.gym.pojos.Users;

public class UserMapper {

    public static Users dtoToCustomerEntity(Userdto userDTO) {
        Users user = new Users();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setAddress(userDTO.getAddress());
        user.setContactNumber(userDTO.getContactNumber());
        user.setEmail(userDTO.getEmail());
        user.setHealthRecords(userDTO.getHealthRecords());
        if (userDTO.getRegistrationDate() != null) {
            user.setRegistrationDate(
                Date.from(userDTO.getRegistrationDate().atStartOfDay(ZoneId.systemDefault()).toInstant())
            );
        }

        return user;
    }

    public static UserResponseDto userEntityToUserResponseDTO(Users userEntity) {
        UserResponseDto userResponseDTO = new UserResponseDto();
        userResponseDTO.setUserId(userEntity.getUserID());
        userResponseDTO.setFirstName(userEntity.getFirstName());
        userResponseDTO.setLastName(userEntity.getLastName());
        userResponseDTO.setAddress(userEntity.getAddress());
        userResponseDTO.setContactNumber(userEntity.getContactNumber());
        userResponseDTO.setEmail(userEntity.getEmail());
        userResponseDTO.setHealthRecords(userEntity.getHealthRecords());
        if (userEntity.getRegistrationDate() != null) {
            userResponseDTO.setRegistrationDate(
                userEntity.getRegistrationDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
            );
        }

        return userResponseDTO;
    }
}
