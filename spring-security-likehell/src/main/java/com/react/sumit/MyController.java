package com.react.sumit;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/api")
public class MyController {
	
	@GetMapping("/about")
	@PreAuthorize("hasAuthority('admin')")
	public String about()
	{
		return "about";
	}
	
	
	@GetMapping("/home")
	@PreAuthorize("hasAnyAuthority('admin','user')")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
	public String login(Authentication authenitcation)
	{
		if(authenitcation !=null&& authenitcation.isAuthenticated())
		{
			return "redirect:/api/";
		}
		else
		{
			return "login";
		}
	}

}
