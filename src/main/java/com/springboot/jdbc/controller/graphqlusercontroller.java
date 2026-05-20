package com.springboot.jdbc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import com.springboot.jdbc.entiy.users;
import com.springboot.jdbc.repo.userrepo;

@Controller
public class graphqlusercontroller {
	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	private userrepo user;
	@QueryMapping
	public List<users>getuserinfo()
	{
		return user.findAll();
	}
	
	@QueryMapping
	public users getById(@Argument Integer uid)
	{
		return user.findById(uid).orElseThrow(()->new RuntimeException("user not Found Exception:"));
	}
	
	@QueryMapping
	public List<Map<String, Object>> getUserData() {
	    String query = "SELECT * FROM users";
	    return template.queryForList(query);
	}
	@MutationMapping
	public ResponseEntity<String> deleteTheUserById(@Argument Integer uid)
	{
		user.deleteById(uid);
		return  ResponseEntity.accepted().body("data is deleted Sucessfully");
	}
	
	@MutationMapping
	public users savedata(@Argument String username,@Argument String contact)
	{
		users newuser= new users();
		newuser.setUsername(username);
		newuser.setContact(contact);
		return user.save(newuser);
	}


}
