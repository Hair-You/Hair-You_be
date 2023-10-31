package Hairyou.demo.user.controller;

import Hairyou.demo.user.repository.entity.User;
import Hairyou.demo.user.service.User_LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class User_LoginController {

    private final User_LoginService loginService;
    @PostMapping("/user")
    public ResponseEntity<String> user_login(@RequestParam String id , @RequestParam String password){
        User user=loginService.login_user(id, password);
        if (user != null) {
            return ResponseEntity.ok("Login successful for user: " + user.getUserName());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }

}
