package Hairyou.demo.designer.service;

import Hairyou.demo.designer.repository.entity.Designer;
import Hairyou.demo.designer.repository.entity.DesignerRepository;
import Hairyou.demo.designer.repository.dto.DesignerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class designerSignupService {

    private final DesignerRepository designerRepository;

    public String registerDesigner(DesignerDto designer) {
        // Implement validation or other business logic if needed
        designerRepository.save(Designer.builder().id(designer.getID()).password(designer.getPassword()).nickname(designer.getNickname()).career(designer.getCareer()).manager(designer.getManager()).designerName(designer.getDesignerName()).build());
        return "Success";

    }
}
