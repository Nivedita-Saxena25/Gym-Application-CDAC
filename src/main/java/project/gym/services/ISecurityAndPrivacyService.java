package project.gym.services;

import java.util.List;

import project.gym.pojos.SecurityAndPrivacy;

public interface ISecurityAndPrivacyService {
	SecurityAndPrivacy getSecurityById(Long securityId);

    List<SecurityAndPrivacy> getAllSecurities();

    SecurityAndPrivacy saveSecurity(SecurityAndPrivacy security);

    void deleteSecurity(Long securityId);
}
