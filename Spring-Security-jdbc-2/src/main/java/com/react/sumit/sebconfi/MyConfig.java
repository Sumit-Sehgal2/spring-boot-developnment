package com.react.sumit.sebconfi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity


public class MyConfig {
	@Bean
	public PasswordEncoder passwordencode()
	{
		return new BCryptPasswordEncoder(11);
	}

}
