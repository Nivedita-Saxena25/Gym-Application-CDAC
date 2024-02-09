package project.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.gym.pojos.Communication;

@Repository
public interface ICommunication extends JpaRepository<Communication, Long> {
    // You can add custom query methods if needed
}
