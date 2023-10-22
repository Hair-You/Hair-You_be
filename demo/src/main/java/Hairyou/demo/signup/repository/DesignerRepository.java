package Hairyou.demo.signup.repository;

import Hairyou.demo.signup.repository.entity.Designer;
import Hairyou.demo.signup.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DesignerRepository extends JpaRepository<Designer,Long> {
    Designer findByID(String ID);
}
