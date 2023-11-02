package Hairyou.demo.user.service;

import Hairyou.demo.user.repository.entity.Gender;
import Hairyou.demo.user.repository.entity.User;
import Hairyou.demo.user.repository.entity.UserRepository;
import Hairyou.demo.user.repository.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userSignupService {

    private final UserRepository userRepository;


    public String registerUser(UserDto userDto){
        // Implement validation or other business logic if needed
        userRepository.save(User.builder().id(userDto.getID()).userName(userDto.getUsername()).password(userDto.getPassword()).gender(userDto.getGender()).number(userDto.getNumber()).build());
        return "Success";
    }

}
