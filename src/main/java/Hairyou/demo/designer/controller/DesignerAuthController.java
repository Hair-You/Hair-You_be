package Hairyou.demo.designer.controller;

import Hairyou.demo.designer.repository.dto.DesignerDto;
import Hairyou.demo.designer.repository.entity.Designer;
import Hairyou.demo.designer.service.DesignerAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth/designer")
public class DesignerAuthController {
    private  final DesignerAuthService designerAuthService;
    @PostMapping("/sign-up")
    public ResponseEntity registerDesigner(@RequestBody DesignerDto designerDto) {
        if(designerAuthService.registerDesigner(designerDto).equals("Success")){
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
    @PostMapping("/login")
    public ResponseEntity<String> designer_login(@RequestParam String id , @RequestParam String password){
        Optional<Designer> designer=designerAuthService.login_designer(id, password);
        return designer.map(value ->
                        ResponseEntity.ok("Login successful for user: " + value.getDesignerName()))
                .orElseThrow(() -> new NoSuchElementException("Designer not found"));
    }
}
