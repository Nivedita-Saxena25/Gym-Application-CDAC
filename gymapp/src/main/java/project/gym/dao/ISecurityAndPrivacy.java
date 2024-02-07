package project.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.gym.pojos.SecurityAndPrivacy;

@Repository
public interface ISecurityAndPrivacy extends JpaRepository<SecurityAndPrivacy, Long> {
    // You can add custom query methods if needed
}
