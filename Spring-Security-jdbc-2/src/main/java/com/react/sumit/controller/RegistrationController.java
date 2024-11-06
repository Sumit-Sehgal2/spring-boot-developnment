package com.react.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.react.sumit.Entity.User;
import com.react.sumit.Model.UserModel;
import com.react.sumit.service.UserService;
import com.react.sumit.service.UserServiceImpl;

public class RegistrationController {
	@Autowired
	private UserService userservice;
	private ApplicationEventPublisher publisher;
	
	
	
	@PostMapping("/register")
	public String registraion(@RequestBody UserModel usermodel)
	{
		User user=userservice.rigisterUser(usermodel);
		publisher.publishEvent(null)
		return "Sucess";
		
		
		
	}
}
