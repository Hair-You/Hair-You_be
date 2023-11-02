package Hairyou.demo.designer.service;

import Hairyou.demo.designer.repository.entity.DesignerRepository;
import Hairyou.demo.designer.repository.entity.Designer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class designerLoginService {

    private final DesignerRepository designerRepository;
    public Designer login_designer(String id, String password) {
        Designer designer = designerRepository.findByid(id);
        if (designer != null && designer.getPassword().equals(password)) {
            return designer;
        }
        return null;
    }
}
