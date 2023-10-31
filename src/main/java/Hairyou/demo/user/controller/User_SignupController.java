package Hairyou.demo.user.controller;

import Hairyou.demo.designer.repository.dto.DesignerDto;
import Hairyou.demo.user.repository.dto.UserDto;
import Hairyou.demo.user.service.User_SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hair")
public class User_SignupController {

    private final User_SignupService userSignupService;

    @PostMapping("/user")
    public ResponseEntity registerUser(@RequestBody UserDto userDto) {
        if(userSignupService.registerUser(userDto).equals("Success")){
            return new ResponseEntity(HttpStatus.CREATED);
        };
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}
