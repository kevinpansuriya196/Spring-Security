/*
package com.example.SpringSecurity.archived;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    public void configureGlobal(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Bean
    public MyFilterSecurityConfigurer myFilterSecurityConfigurer() {
        return new MyFilterSecurityConfigurer();
    }

    private static class MyFilterSecurityConfigurer extends SecurityConfigurerAdapter<Void, HttpSecurity> {

        @Override
        public void configure(HttpSecurity http) throws Exception {
            // Your additional security configurations go here
            // For example, you can add custom filters using http.addFilterBefore()
            // or customize authentication providers, etc.
        }
    }
}

*/
