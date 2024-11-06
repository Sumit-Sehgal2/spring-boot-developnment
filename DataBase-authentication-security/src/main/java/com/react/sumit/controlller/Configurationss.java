package com.react.sumit.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)

public class Configurationss {
	@Autowired
	private Userdetaislss userdetails;
	
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	@Bean
	public DaoAuthenticationProvider authnecticationprovider()
	{
		DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
		provider.setUserDetailsService(userdetails);
		provider.setPasswordEncoder(encoder());
		return provider;
		
	}
	@Bean
	public SecurityFilterChain chaining(HttpSecurity http) throws Exception {
	    http
	        .csrf().disable()
	        .authorizeHttpRequests()
	        .requestMatchers("/").permitAll()
	        .requestMatchers("/about").hasRole("USER")
	        .requestMatchers("/home").hasRole("ADMIN")
	        .anyRequest().authenticated()
	        .and()
	        .formLogin()
	            .loginPage("/api/signin") // Make sure the path is correct
	           .loginProcessingUrl("/login").defaultSuccessUrl("/api/").permitAll()
	        .and()
	        .logout().permitAll(); // Optional: enable logout
	    return http.build();
	}

}
