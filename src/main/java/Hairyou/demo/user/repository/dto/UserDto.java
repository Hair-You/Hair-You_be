package Hairyou.demo.user.repository.dto;

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
    private String ID;
    private String password;
    private String username;
    private String gender;
    private String number;
}
