package com.react.sumit;

import org.apache.el.parser.AstTrue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class Configu {

    @Bean
    public UserDetailsService getverified() {
        UserDetails user = User.withUsername("sumit")
                .password(password().encode("sumit"))
                .roles("USER")  // Assign role "USER"
                .build();

        UserDetails admin = User.withUsername("ramu")  
                .password(password().encode("ramu"))
                .roles("ADMIN")  // Assign role "ADMIN"
                .build();

        return new InMemoryUserDetailsManager(user, admin);  
    }

    @Bean
    public SecurityFilterChain security(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests()
            .requestMatchers("/").permitAll()  // Root page accessible to everyone
            .requestMatchers("/about").hasAuthority("ROLE_USER")  // About page accessible only to "ROLE_USER"
            .requestMatchers("/home").hasAuthority("ROLE_ADMIN")  // Home page accessible only to "ROLE_ADMIN"
            .anyRequest().authenticated()  // Any other request must be authenticated
            .and()
            .formLogin();  // Enable form-based login

        return http.build();
    }

    @Bean
    public PasswordEncoder password() {
        return new BCryptPasswordEncoder();
    }
}
