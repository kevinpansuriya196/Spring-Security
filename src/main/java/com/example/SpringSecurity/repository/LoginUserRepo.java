package com.example.SpringSecurity.repository;

import com.example.SpringSecurity.entity.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUserRepo extends JpaRepository<LoginUser, Integer> {

    LoginUser findByUsername(String username);
}
