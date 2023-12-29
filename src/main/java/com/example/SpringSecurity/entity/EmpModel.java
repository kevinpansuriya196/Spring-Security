package com.example.SpringSecurity.entity;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "springsecurity")
@AllArgsConstructor
@NoArgsConstructor
public class EmpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Name(value = "id")
    private int id;
    @Name(value = "name")
    private String name;
    @Name(value = "email")
    private String email;
    @Name(value = "city")
    private String city;


}
