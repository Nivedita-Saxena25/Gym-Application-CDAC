package project.gym.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gym.dao.IMembership;
import project.gym.pojos.Membership;

import java.util.List;

@Service
public class MembershipService implements IMembershipService {
	@Autowired
    private final IMembership membershipDAO;

    
    public MembershipService(IMembership membershipDAO) {
        this.membershipDAO = membershipDAO;
    }

    @Override
    public Membership getMembershipById(Long membershipId) {
        return membershipDAO.findById(membershipId).orElse(null);
    }

    @Override
    public List<Membership> getAllMemberships() {
        return membershipDAO.findAll();
    }

    @Override
    public Membership saveMembership(Membership membership) {
        return membershipDAO.save(membership);
    }

    @Override
    public void deleteMembership(Long membershipId) {
        membershipDAO.deleteById(membershipId);
    }
}

