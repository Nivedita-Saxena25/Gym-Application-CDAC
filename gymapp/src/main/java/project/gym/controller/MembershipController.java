package project.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.gym.dto.MembershipDto.MembershipResponseDto;
import project.gym.dto.MembershipDto.RegistrationRequestDto;
import project.gym.mapper.MembershipMapper;
import project.gym.pojos.Membership;
import project.gym.services.IMembershipService;

@RestController
@RequestMapping("/membership")
@CrossOrigin("*")
public class MembershipController {
	@Autowired
	private IMembershipService MembershipService;

	@PostMapping("/reg_membership")
	public ResponseEntity<String> registerMembership(@RequestBody Membership membership) {
		// Save the Membership
		MembershipService.saveMembership(membership);
		return new ResponseEntity<>("Membership registered successfully", HttpStatus.OK);
	}

	@GetMapping("/getAllMemberships")
	public List<MembershipResponseDto> getAllMemberships() {
		List<Membership> membership = MembershipService.getAllMemberships();
		return MembershipMapper.membershipEntityListToResponseDtoList(membership);
	}

	@PutMapping("/updateMembership/{id}")
	public ResponseEntity<MembershipResponseDto> updateMembershipById(@PathVariable Long id,
			@RequestBody RegistrationRequestDto updatedMembershipDto) {
		try {
			Membership updatedMembership = MembershipService.updateMembership(id,
					MembershipMapper.dtoToMembershipEntity(updatedMembershipDto));
			return ResponseEntity.ok(MembershipMapper.membershipEntityToResponseDto(updatedMembership));
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getMembershipById/{id}")
	public ResponseEntity<MembershipResponseDto> getMembershipById(@PathVariable Long id) {
		try {
			Membership membership = MembershipService.getMembershipById(id);
			return ResponseEntity.ok(MembershipMapper.membershipEntityToResponseDto(membership));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteMembership/{id}")
	public ResponseEntity<String> deleteMembership(@PathVariable Long id) {
		try {
			String result = MembershipService.deleteMembership(id);
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
