package com.hufsice.icebreaker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="certification") // 아래의 클래스를 이 엔티티의 클래스로 사용하겠다는 선언, JPA에서는 certification라는 이름으로 쓰겠다는 명칭
@Table(name="certification") // MySQL 테이블과 매핑
public class CertificationEntity {
    @Id
    private String userId;
    private String email;
    private String certification_number; // MySQL에서는 int로 잡아주었지만 0이 올 수 있기 때문에 String으로 잡는다.
}
