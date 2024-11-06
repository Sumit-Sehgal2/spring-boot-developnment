package com.react.sumit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")

public class Controller
{
	@GetMapping("/public")
	public String publicapi()
	{
		return "this is an public Api";
	}
	@GetMapping("/admin")
	public String adminapi()
	{
		return "this is an admin Api";
	}
	
	@GetMapping("/user")
	public String userapi()
	{
		return "this is an user Api";
	}
	
}
