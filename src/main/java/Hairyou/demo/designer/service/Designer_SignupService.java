package Hairyou.demo.designer.service;

import Hairyou.demo.designer.repository.entity.Designer;
import Hairyou.demo.designer.repository.entity.DesignerRepository;
import Hairyou.demo.designer.repository.dto.DesignerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Designer_SignupService {

    private final DesignerRepository designerRepository;

    public String registerDesigner(DesignerDto designer) {
        // Implement validation or other business logic if needed
        designerRepository.save(Designer.builder().ID(designer.getID()).password(designer.getPassword()).nickName(designer.getNickName()).career(designer.getCareer()).manager(designer.getManager()).designerName(designer.getDesignerName()).build());
        return "Success";

    }
}
