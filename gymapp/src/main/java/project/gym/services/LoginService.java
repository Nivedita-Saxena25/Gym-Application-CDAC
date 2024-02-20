package project.gym.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import project.gym.customException.UserNotFoundException;
import project.gym.dao.ILogin;
import project.gym.dao.IUsers;
import project.gym.pojos.Login;
import project.gym.pojos.Users;

@Service
public class LoginService implements UserDetailsService,ILoginService {
    @Autowired
    private final ILogin logindao;

    @Autowired
    public LoginService(ILogin usersDAO) {
        this.logindao = usersDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Login user = logindao.findByUsername(email)
                .orElseThrow(() -> new UserNotFoundException("Username not found: " + email));
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        // Creating a UserDetails object using Spring Security's User class
        return user;
    }

}
