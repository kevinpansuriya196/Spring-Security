package com.example.SpringSecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class JwtRequest {
    private String  email;
    private String  password;

}
