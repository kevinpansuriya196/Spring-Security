//package com.example.SpringSecurity.services;
//
//import com.example.SpringSecurity.entity.LoginUser;
//import com.example.SpringSecurity.repository.LoginUserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserLogin implements UserDetailsService {
//    @Autowired
//    private LoginUserRepo loginUserRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        LoginUser user = loginUserRepo.findByUsername(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//        return org.springframework.security.core.userdetails.User
//                .withUsername(user.getUsername())
//                .password(user.getPassword())
//                .roles("USER")  // Add roles as needed
//                .build();
//    }
//}
