package project.gym.services;

import java.util.List;

import project.gym.pojos.Membership;

public interface IMembershipService {
	 Membership getMembershipById(Long membershipId);

	    List<Membership> getAllMemberships();

	    Membership saveMembership(Membership membership);

	    void deleteMembership(Long membershipId);
}
