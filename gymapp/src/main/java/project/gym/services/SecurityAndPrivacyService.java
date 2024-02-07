package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gym.dao.ISecurityAndPrivacy;
import project.gym.pojos.SecurityAndPrivacy;

import java.util.List;

@Service
public class SecurityAndPrivacyService implements ISecurityAndPrivacyService {
	@Autowired
    private final ISecurityAndPrivacy securityDAO;

    
    public SecurityAndPrivacyService(ISecurityAndPrivacy securityDAO) {
        this.securityDAO = securityDAO;
    }

    @Override
    public SecurityAndPrivacy getSecurityById(Long securityId) {
        return securityDAO.findById(securityId).orElse(null);
    }

    @Override
    public List<SecurityAndPrivacy> getAllSecurities() {
        return securityDAO.findAll();
    }

    @Override
    public SecurityAndPrivacy saveSecurity(SecurityAndPrivacy security) {
        return securityDAO.save(security);
    }

    @Override
    public void deleteSecurity(Long securityId) {
        securityDAO.deleteById(securityId);
    }
}
