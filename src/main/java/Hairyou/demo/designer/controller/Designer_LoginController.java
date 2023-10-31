package Hairyou.demo.designer.controller;

import Hairyou.demo.designer.repository.entity.Designer;
import Hairyou.demo.designer.service.Designer_LoginService;
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
public class Designer_LoginController {

    private final Designer_LoginService designerLoginService;
    @PostMapping("/designer")
    public ResponseEntity<String> designer_login(@RequestParam String id , @RequestParam String password){
        Designer designer=designerLoginService.login_designer(id, password);
        if (designer != null) {
            return ResponseEntity.ok("Login successful for user: " + designer.getDesignerName());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
}
