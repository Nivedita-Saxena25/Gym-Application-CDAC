package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gym.dao.ICommunication;
import project.gym.pojos.Communication;

import java.util.List;

@Service
public class CommunicationService implements ICommunicationService {
	@Autowired
    private final ICommunication communicationDAO;

    
    public CommunicationService(ICommunication communicationDAO) {
        this.communicationDAO = communicationDAO;
    }

    @Override
    public Communication getCommunicationById(Long communicationId) {
        return communicationDAO.findById(communicationId).orElse(null);
    }

    @Override
    public List<Communication> getAllCommunications() {
        return communicationDAO.findAll();
    }

    @Override
    public Communication saveCommunication(Communication communication) {
        return communicationDAO.save(communication);
    }

    @Override
    public void deleteCommunication(Long communicationId) {
        communicationDAO.deleteById(communicationId);
    }
}
