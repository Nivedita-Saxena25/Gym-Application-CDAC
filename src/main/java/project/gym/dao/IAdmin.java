package project.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.gym.pojos.Admin;

public interface IAdmin extends JpaRepository<Admin, Long> {

}
