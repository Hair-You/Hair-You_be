package Hairyou.demo.user.repository.entity;

import Hairyou.demo.user.repository.dto.UserDto;
import Hairyou.demo.user.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByid(String id);
}

