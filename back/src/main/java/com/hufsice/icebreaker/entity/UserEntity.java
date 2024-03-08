package com.hufsice.icebreaker.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Getter // 멤버 변수에 대한 getter메서드를 만들어주는 어노테이션
@NoArgsConstructor // 매개변수가 없는 생성자
@AllArgsConstructor // 모든 필드에 대한 생성자 
@Entity(name="user") // 아래의 클래스를 이 엔티티의 클래스로 사용하겠다는 선언, JPA에서는 user라는 이름으로 쓰겠다는 명칭
@Table(name="user") // MySQL 테이블과 매핑
public class UserEntity {
    @Id
    // 원래는 @Column(name="user_id") 형식으로 필드를 처리해줘야 한다.
    private String userId;
    private String password;
    private String email;
    private String type;
    private String role;
}
