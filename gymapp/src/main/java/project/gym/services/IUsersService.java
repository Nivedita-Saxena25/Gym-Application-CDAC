package project.gym.services;

import java.util.List;

import project.gym.pojos.Users;

public interface IUsersService {
    Users getUserById(Long userId);

    List<Users> getAllUsers();

    Users saveUser(Users user);

    void deleteUser(Long userId);
}

