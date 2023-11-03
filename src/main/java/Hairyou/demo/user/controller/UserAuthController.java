package Hairyou.demo.user.controller;

import Hairyou.demo.user.repository.dto.UserDto;
import Hairyou.demo.user.repository.entity.User;
import Hairyou.demo.user.service.userLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth/user")
public class UserAuthController {
    private final Hairyou.demo.user.service.userSignupService userSignupService;
    private final userLoginService loginService;
    @PostMapping("/sign-up")
    public ResponseEntity registerUser(@RequestBody UserDto userDto) {
        if(userSignupService.registerUser(userDto).equals("Success")){
            return new ResponseEntity(HttpStatus.CREATED);
        };
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    @PostMapping("/login")
    public ResponseEntity<String> user_login(@RequestParam String id , @RequestParam String password){
        User user=loginService.login_user(id, password);
        if (user != null) {
            return ResponseEntity.ok("Login successful for user: " + user.getUserName());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
}
