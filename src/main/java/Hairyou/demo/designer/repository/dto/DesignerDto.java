package Hairyou.demo.designer.repository.dto;

import Hairyou.demo.designer.repository.entity.Designer;
import Hairyou.demo.user.repository.entity.User;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
public class DesignerDto {
    private String ID;
    private String password;
    private String designerName;
    private String nickname;
    private String career;
    private String manager;
    public Designer toEntity(){
        return Designer.builder()
                .id(ID)
                .password(password)
                .designerName(designerName)
                .nickname(nickname)
                .career(career)
                .manager(manager)
                .build();
    }
}
