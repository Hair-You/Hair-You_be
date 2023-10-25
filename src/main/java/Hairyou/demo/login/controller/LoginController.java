package Hairyou.demo.login.controller;

import Hairyou.demo.login.service.LoginService;
import Hairyou.demo.signup.repository.entity.Designer;
import Hairyou.demo.signup.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/user")
    public ResponseEntity<String> user_login(@RequestParam String id , @RequestParam String password){
        User user=loginService.login_user(id, password);
        if (user != null) {
            return ResponseEntity.ok("Login successful for user: " + user.getUsername());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
    @PostMapping("/designer")
    public ResponseEntity<String> designer_login(@RequestParam String id , @RequestParam String password){
        Designer designer=loginService.login_designer(id, password);
        if (designer != null) {
            return ResponseEntity.ok("Login successful for user: " + designer.getDesigner_name());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
}
