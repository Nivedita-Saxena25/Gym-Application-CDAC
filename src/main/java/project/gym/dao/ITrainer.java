package project.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.gym.pojos.Trainer;

public interface ITrainer extends JpaRepository<Trainer, Long> {

}
