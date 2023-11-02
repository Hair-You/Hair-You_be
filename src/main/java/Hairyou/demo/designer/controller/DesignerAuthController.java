package Hairyou.demo.designer.controller;

import Hairyou.demo.designer.repository.dto.DesignerDto;
import Hairyou.demo.designer.repository.entity.Designer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/auth/designer")
public class DesignerAuthController {
    private final Hairyou.demo.designer.service.designerLoginService designerLoginService;
    private final Hairyou.demo.designer.service.designerSignupService designerSignupService;
    @PostMapping("/signup")
    public ResponseEntity registerDesigner(@RequestBody DesignerDto designerDto) {
        if(designerSignupService.registerDesigner(designerDto).equals("Success")){
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    @PostMapping("/login")
    public ResponseEntity<String> designer_login(@RequestParam String id , @RequestParam String password){
        Designer designer=designerLoginService.login_designer(id, password);
        if (designer != null) {
            return ResponseEntity.ok("Login successful for user: " + designer.getDesignerName());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
}
