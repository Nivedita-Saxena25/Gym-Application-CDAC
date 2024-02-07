package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.gym.dao.IAdmin;
import project.gym.pojos.Admin;

import java.util.List;

@Service
public class AdminService implements IAdminService {
	 @Autowired
    private final IAdmin adminDAO;

   
    public AdminService(IAdmin adminDAO) {
        this.adminDAO = adminDAO;
    }

    @Override
    public Admin getAdminById(Long adminId) {
        return adminDAO.findById(adminId).orElse(null);
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminDAO.findAll();
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminDAO.save(admin);
    }

    @Override
    public void deleteAdmin(Long adminId) {
        adminDAO.deleteById(adminId);
    }
}

