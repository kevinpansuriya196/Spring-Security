package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.entity.EmpModel;
import com.example.SpringSecurity.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/spring")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping(path = "/users")

    public List<EmpModel> getAll() {
        return empService.getAll();
    }

    @GetMapping(path = "/users/")
    public EmpModel getById(@RequestParam int id) {
        return empService.getById(id);
    }

    @PostMapping(path = "/users")
    public EmpModel addUser(@RequestBody EmpModel emp) {
        return empService.addUser(emp);
    }

}
