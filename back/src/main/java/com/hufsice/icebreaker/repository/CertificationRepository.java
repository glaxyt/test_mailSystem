package com.hufsice.icebreaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hufsice.icebreaker.entity.CertificationEntity;

public interface CertificationRepository extends JpaRepository<CertificationEntity, String>{
        
    
}