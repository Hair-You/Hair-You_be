package Hairyou.demo.signup.service;

import Hairyou.demo.signup.repository.DesignerRepository;
import Hairyou.demo.signup.repository.UserRepository;
import Hairyou.demo.signup.repository.entity.Designer;
import Hairyou.demo.signup.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DesignerRepository designerRepository;

    public User registerUser(User user) {
        // Implement validation or other business logic if needed
        return userRepository.save(user);
    }
    public Designer registerdesigner(Designer designer) {
        // Implement validation or other business logic if needed
        return designerRepository.save(designer);
    }
}
