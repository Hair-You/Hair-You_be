package Hairyou.demo.login.repository;

import Hairyou.demo.signup.repository.entity.Designer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignerRepository extends JpaRepository<Designer,Long> {
    Designer findByID(String ID);
}
