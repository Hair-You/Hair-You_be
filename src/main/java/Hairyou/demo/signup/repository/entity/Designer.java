package Hairyou.demo.signup.repository.entity;

import jakarta.persistence.*;
import lombok.*;

@Data  //getter setter 생성자
@NoArgsConstructor //파라미터 없는 기본 생성자
@AllArgsConstructor //모든 필드 초기화용
@Builder
@Entity //JPA 데이터베이스 테이블과 매핑되는 엔티티
@Getter
@Setter
@Table
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(nullable = false, length = 30) // column의 조건
    private String ID;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 30)
    private String designer_name;

    @Column(nullable = false, length = 100)
    private String nickname;

    @Column(nullable = false, length = 30)
    private String career;

    @Column(nullable = false, length = 100)
    private String manager;
}
