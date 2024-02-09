package project.gym.services;

import java.util.List;

import project.gym.pojos.Communication;

public interface ICommunicationService {
	Communication getCommunicationById(Long communicationId);

    List<Communication> getAllCommunications();

    Communication saveCommunication(Communication communication);

    void deleteCommunication(Long communicationId);
}
