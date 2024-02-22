package project.gym.dao;

<<<<<<< HEAD
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.gym.pojos.Users;

@Repository
public interface IUsers extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
=======



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.gym.pojos.Users;

@Repository
public interface IUsers extends JpaRepository<Users, Long> {
	Users findByEmail(String email);
    
>>>>>>> branch 'Nivedita' of https://github.com/Nivedita-Saxena25/Health-Fitness-Management-System.git
}

