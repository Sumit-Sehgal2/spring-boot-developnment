package com.react.sumit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class myController {
	
	@GetMapping("/login")
	public String rest()
	{
		return "Welcome to the restapi";
	}
	@GetMapping("/greet")
	public String greet()
	{
		return"you are not authorized";
	}

}
