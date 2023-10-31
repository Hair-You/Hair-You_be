package Hairyou.demo.user.service;

import Hairyou.demo.user.repository.entity.UserRepository;
import Hairyou.demo.user.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class User_LoginService {

    private final UserRepository userRepository;


    public User login_user(String id, String password) {
        User user = userRepository.findByID(id);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

}
