package Hairyou.demo.designer.repository.entity;

import Hairyou.demo.designer.repository.dto.DesignerDto;
import Hairyou.demo.designer.repository.entity.Designer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignerRepository extends JpaRepository<Designer,Long> {
    Designer findByid(String id);
}
