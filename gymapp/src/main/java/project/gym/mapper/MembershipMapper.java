package project.gym.mapper;

import java.util.List;
import java.util.stream.Collectors;

<<<<<<< HEAD
import org.springframework.util.StringUtils;
import project.gym.customException.InvalidRegistrationException;
import project.gym.dto.MembershipDto.MembershipResponseDto;
import project.gym.dto.MembershipDto.RegistrationRequestDto;
import project.gym.pojos.Membership;

=======
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import project.gym.customException.InvalidRegistrationException;
import project.gym.dto.MembershipDto.MembershipResponseDto;
import project.gym.dto.MembershipDto.RegistrationRequestDto;
import project.gym.pojos.Membership;
@Component
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
public class MembershipMapper {

	public static Membership dtoToMembershipEntity(RegistrationRequestDto membershipRequestDto) {
		if (membershipRequestDto == null) {
			throw new InvalidRegistrationException("Invalid membership DTO: MembershipRequestDto is null");
		}

		// Validate required fields
		if (StringUtils.isEmpty(membershipRequestDto.getMembershipType())
				|| membershipRequestDto.getMembershipType() != null
				|| membershipRequestDto.getRegistrationDate() == null || membershipRequestDto.getRenewalDate() == null
				|| membershipRequestDto.getExpirationDate() == null) {
			throw new InvalidRegistrationException("Invalid membership DTO: Missing required fields");
		}

		Membership membership = new Membership();

		// Set membership details from MembershipRequestDto
		membership.setMembershipType(membershipRequestDto.getMembershipType());
		membership.setRegistrationDate(membershipRequestDto.getRegistrationDate());
		membership.setRenewalDate(membershipRequestDto.getRenewalDate());
		membership.setExpirationDate(membershipRequestDto.getExpirationDate());

		return membership;
	}

	public static MembershipResponseDto membershipEntityToResponseDto(Membership membershipEntity) {
		if (membershipEntity == null) {
			throw new IllegalArgumentException("Membership entity cannot be null");
		}

		MembershipResponseDto responseDto = new MembershipResponseDto();

		// Map entity fields to response DTO
		responseDto.setMembershipType(membershipEntity.getMembershipType());
		responseDto.setRegistrationDate(membershipEntity.getRegistrationDate());
		responseDto.setExpirationDate(membershipEntity.getRenewalDate());
		responseDto.setExpirationDate(membershipEntity.getExpirationDate());

		return responseDto;
	}

	public static List<MembershipResponseDto> membershipEntityListToResponseDtoList(List<Membership> memberships) {
		return memberships.stream().map(MembershipMapper::membershipEntityToResponseDto).collect(Collectors.toList());
	}
}
