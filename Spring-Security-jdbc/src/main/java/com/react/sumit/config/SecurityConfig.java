package com.react.sumit.config;

import javax.sql.DataSource;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class SecurityConfig {
	@Autowired
	private DataSource datasource;
	@Autowired
	public void authmaneger(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.jdbcAuthentication()
		.dataSource(datasource)
		.passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("select username, password, enabled from users where username = ?")
		
		.authoritiesByUsernameQuery("select username, authority from authorities where username = ?");
	}
	public SecurityFilterChain security(HttpSecurity http)throws Exception
	{
		http.authorizeHttpRequests((req)->
		req.requestMatchers("/admin").hasRole("ROLE_ADMIN")
		.requestMatchers("/user").hasAnyRole("ROLE-ADMIN","ROLE_USER")
		.requestMatchers("/").permitAll()
		.anyRequest().authenticated()
		).formLogin();
		return http.build();
	}

	
	
	

}
