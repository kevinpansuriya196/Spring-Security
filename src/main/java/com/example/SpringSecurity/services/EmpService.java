package com.example.SpringSecurity.services;

import com.example.SpringSecurity.entity.EmpModel;
import com.example.SpringSecurity.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;

    public List<EmpModel> getAll() {
        return empRepository.findAll();
    }

    public EmpModel getById(int id) {
        EmpModel emp = empRepository.findById(id).get();
        return emp;

    }

    public EmpModel addUser(EmpModel emp) {
        return empRepository.save(emp);
    }
}
