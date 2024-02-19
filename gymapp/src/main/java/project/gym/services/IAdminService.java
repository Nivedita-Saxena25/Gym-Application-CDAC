package project.gym.services;

import java.util.List;

import project.gym.pojos.Admin;

public interface IAdminService {

	Admin getAdminById(Long adminId);

    List<Admin> getAllAdmins();

    Admin saveAdmin(Admin admin);

    void deleteAdmin(Long adminId);
}
