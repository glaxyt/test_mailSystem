package com.hufsice.icebreaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hufsice.icebreaker.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
    
}
