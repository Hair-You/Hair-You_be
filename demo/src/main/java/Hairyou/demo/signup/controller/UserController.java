package Hairyou.demo.signup.controller;

import Hairyou.demo.signup.repository.entity.Designer;
import Hairyou.demo.signup.repository.entity.User;
import Hairyou.demo.signup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hair")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
    @PostMapping("/designer")
    public ResponseEntity<Designer> registerDesigner(@RequestBody Designer designer) {
        Designer savedUser = userService.registerdesigner(designer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
}
