package Hairyou.demo.login.repository;

import Hairyou.demo.signup.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByID(String id);
}
