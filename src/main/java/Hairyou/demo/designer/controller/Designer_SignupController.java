package Hairyou.demo.designer.controller;

import Hairyou.demo.designer.repository.dto.DesignerDto;
import Hairyou.demo.designer.service.Designer_SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hair")
public class Designer_SignupController {

    private final Designer_SignupService designerSignupService;
    @PostMapping("/designer")
    public ResponseEntity registerDesigner(@RequestBody DesignerDto designerDto) {
        if(designerSignupService.registerDesigner(designerDto).equals("Success")){
        return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
