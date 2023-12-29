package com.example.SpringSecurity.repository;


import com.example.SpringSecurity.entity.EmpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpModel, Integer> {

}
