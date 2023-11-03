package Hairyou.demo.designer.service;

import Hairyou.demo.designer.repository.dto.DesignerDto;
import Hairyou.demo.designer.repository.entity.Designer;
import Hairyou.demo.designer.repository.entity.DesignerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DesignerAuthService {
    private final DesignerRepository designerRepository;
    public Designer login_designer(String id, String password) {
        Designer designer = designerRepository.findByid(id);
        if (designer != null && designer.getPassword().equals(password)) {
            return designer;
        }
        return null;
    }
    public String registerDesigner(DesignerDto designer) {
        // Implement validation or other business logic if needed
        designerRepository.save(designer.toEntity());
        return "Success";

    }
}
