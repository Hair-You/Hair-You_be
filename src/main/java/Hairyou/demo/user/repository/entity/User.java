package Hairyou.demo.user.repository.entity;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor (access = AccessLevel.PROTECTED)//파라미터 없는 기본 생성자
@AllArgsConstructor //모든 필드 초기화용
@Builder
@Entity//JPA 데이터베이스 테이블과 매핑되는 엔티티
@Getter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(name = "id", length = 30) // column의 조건
    private String id;

    @Column(name = "password",nullable = false, length = 100)
    private String password;

    @Column(name = "user_name",nullable = false, length = 30)
    private String userName;

    @Column(name="gender",nullable = false, length = 10)
    private String gender;

    @Column(name = "number",nullable = false, length = 30)
    private String number;

}
