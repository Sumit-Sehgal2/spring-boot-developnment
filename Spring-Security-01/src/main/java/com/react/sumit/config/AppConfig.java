package com.react.sumit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppConfig {
	
	
	public SecurityFilterChain filter(HttpSecurity http)throws Exception
	{
		http.authorizeHttpRequests((req)->
		req.requestMatchers("/login")
		.permitAll()
		.anyRequest()
		.authenticated())
		.formLogin();
		return http.build();
	}

}
