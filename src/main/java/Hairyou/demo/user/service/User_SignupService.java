package Hairyou.demo.user.service;

import Hairyou.demo.user.repository.entity.User;
import Hairyou.demo.user.repository.entity.UserRepository;
import Hairyou.demo.user.repository.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class User_SignupService {

    private final UserRepository userRepository;


    public String registerUser(UserDto userDto){
        // Implement validation or other business logic if needed
        userRepository.save(User.builder().ID(userDto.getID()).userName(userDto.getUsername()).password(userDto.getPassword()).gender(userDto.getGender()).number(userDto.getNumber()).build());
        return "Success";
    }

}
