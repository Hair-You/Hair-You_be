package Hairyou.demo.user.service;

import Hairyou.demo.user.repository.entity.UserRepository;
import Hairyou.demo.user.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userLoginService {

    private final UserRepository userRepository;


    public User login_user(String id, String password) {
        User user = userRepository.findByid(id);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

}
