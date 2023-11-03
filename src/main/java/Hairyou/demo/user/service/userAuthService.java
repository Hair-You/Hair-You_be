package Hairyou.demo.user.service;

import Hairyou.demo.user.repository.dto.UserDto;
import Hairyou.demo.user.repository.entity.User;
import Hairyou.demo.user.repository.entity.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userAuthService {
    private final UserRepository userRepository;
    public User login_user(String id, String password) {
        User user = userRepository.findByid(id);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    public String registerUser(UserDto userDto){
        // Implement validation or other business logic if needed
        userRepository.save(userDto.toEntity());
        return "Success";
    }
}
