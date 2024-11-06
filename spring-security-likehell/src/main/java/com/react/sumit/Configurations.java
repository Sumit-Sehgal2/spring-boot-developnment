package com.react.sumit;

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
public class Configurations {
	@Autowired
	private servicess service;
	
	@Bean
	public DaoAuthenticationProvider authentication()
	{
		
		DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
		provider.setUserDetailsService(service);
		provider.setPasswordEncoder(encoder());
		return provider;
		
	}

	
	@Bean
	public SecurityFilterChain chain(HttpSecurity http) throws Exception
	{
		http.csrf()
		.disable()
		.authorizeHttpRequests()
		.requestMatchers("/")
		.permitAll()
		.requestMatchers("/home")
		.hasRole("ADMIN")
		.requestMatchers("about")
		.hasAnyRole("ADMIN","USER")
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.loginPage("/api/login")
		.loginProcessingUrl("/login")
		.defaultSuccessUrl("/api/")
		.permitAll()
		.and()
		.logout()
		.permitAll();
		
		return http.build();
		
	}
	
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	
	

}
