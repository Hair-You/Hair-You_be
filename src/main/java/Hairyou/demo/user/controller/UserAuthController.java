package Hairyou.demo.user.controller;

import Hairyou.demo.user.repository.dto.UserDto;
import Hairyou.demo.user.repository.entity.User;
import Hairyou.demo.user.service.userAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth/user")
public class UserAuthController {
    private final userAuthService userAuthService;

    @PostMapping("/sign-up")
    public ResponseEntity registerUser(@RequestBody UserDto userDto) throws Exception {
        if(userAuthService.registerUser(userDto).equals("Success")){
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    @PostMapping("/login")
    public ResponseEntity<String> user_login(@RequestParam String id , @RequestParam String password){
        Optional<User> user=userAuthService.login_user(id, password);
        return user.map(value ->
                        ResponseEntity.ok("Login successful for user: " + value.getUserName()))
                .orElseThrow(() -> new NoSuchElementException("User not found"));

    }
}
