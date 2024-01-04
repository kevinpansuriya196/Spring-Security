package com.example.SpringSecurity.entity;

import jakarta.persistence.Entity;
import lombok.*;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class JwtResponse {
    private String  jwtToken;
    private String  username;

}
