package com.react.sumit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig { // Renamed for clarity

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { // Updated method name
        http.csrf().disable()
            .authorizeHttpRequests()
                .requestMatchers("/login")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
            .formLogin()
                .loginPage("/login") // Added leading slash
                .permitAll()
                .defaultSuccessUrl("/index", true)
                .failureUrl("/login?error=true")
                .and()
            .logout()
                .permitAll();
        
        return http.build();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() { // Updated method name for clarity
        return new BCryptPasswordEncoder();
    }
}
