package Hairyou.demo.user.service;

import Hairyou.demo.user.repository.dto.UserDto;
import Hairyou.demo.user.repository.entity.User;
import Hairyou.demo.user.repository.entity.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class userAuthService {
    private final UserRepository userRepository;
    public Optional<User> login_user(String id, String password) {
        Optional<User> user = Optional.ofNullable(userRepository.findByid(id).orElseThrow(EntityNotFoundException::new));
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        }

        return Optional.empty();
    }
    public String registerUser(UserDto userDto){
        // Implement validation or other business logic if needed
        userRepository.save(userDto.toEntity());
        return "Success";
    }
}
