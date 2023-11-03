package Hairyou.demo.user.repository.dto;

import Hairyou.demo.user.repository.entity.Gender;
import Hairyou.demo.user.repository.entity.User;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String id;
    private String password;
    private String username;
    private Gender gender;
    private String number;

    public User toEntity(){
        return User.builder()
                .id(id)
                .password(password)
                .userName(username)
                .gender(gender)
                .number(number)
                .build();
    }
}

