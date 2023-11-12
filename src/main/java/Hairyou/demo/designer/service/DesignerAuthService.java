package Hairyou.demo.designer.service;

import Hairyou.demo.designer.repository.dto.DesignerDto;
import Hairyou.demo.designer.repository.entity.Designer;
import Hairyou.demo.designer.repository.entity.DesignerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DesignerAuthService {
    private final DesignerRepository designerRepository;
    public Optional<Designer> loginDesigner(String id, String password) {
        Optional<Designer> designer = Optional.ofNullable(designerRepository.findByid(id).orElseThrow(EntityNotFoundException::new));
        if (designer.isPresent() && designer.get().getPassword().equals(password)) {
            return designer;
        }
        return Optional.empty();
    }
    public String registerDesigner(DesignerDto designer) {
        // Implement validation or other business logic if needed
        designerRepository.save(designer.toEntity());
        return "Success";

    }
}
