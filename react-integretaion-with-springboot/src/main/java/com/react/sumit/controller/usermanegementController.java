package com.react.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.react.sumit.dto.UserDetails;
import com.react.sumit.service.UserManegementService;

@RestController

public class usermanegementController {
	@Autowired
	UserManegementService usermanegementservice;
	
	
	@PostMapping("/user/signup")
	public ResponseEntity<String>createuser(@RequestBody UserDetails userdetails)
	{
		String result=usermanegementservice.createUser(userdetails);
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
		
	}
	

}
