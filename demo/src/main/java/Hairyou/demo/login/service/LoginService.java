package Hairyou.demo.login.service;

import Hairyou.demo.login.repository.DesignerRepository;
import Hairyou.demo.login.repository.UserRepository;
import Hairyou.demo.signup.repository.entity.Designer;
import Hairyou.demo.signup.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DesignerRepository designerRepository;

    public User login_user(String id, String password) {
        User user = userRepository.findByID(id);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    public Designer login_designer(String id, String password) {
        Designer designer = designerRepository.findByID(id);
        if (designer != null && designer.getPassword().equals(password)) {
            return designer;
        }
        return null;
    }
}
