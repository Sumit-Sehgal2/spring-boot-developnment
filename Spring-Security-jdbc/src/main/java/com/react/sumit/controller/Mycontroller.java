package com.react.sumit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home ")

public class Mycontroller {
	@GetMapping(value = "/user")
	
	public String user()
	{
		return "<h1> welcome to users </h1>";
	}
	@GetMapping(value = "/admin")
	
	public String admin()
	{
		return "<h1> welcome to admin page </h1>";
	}
	@GetMapping(value = "/")
	
	public String Welcome()
	{
		return "welcome to the page";
	}



}
