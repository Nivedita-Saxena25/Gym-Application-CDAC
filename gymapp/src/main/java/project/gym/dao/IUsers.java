package project.gym.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.gym.pojos.Users;

@Repository
public interface IUsers extends JpaRepository<Users, Long> {
	Users findByEmail(String email);
    
}

