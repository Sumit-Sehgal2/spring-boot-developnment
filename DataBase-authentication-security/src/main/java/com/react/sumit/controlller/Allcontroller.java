package com.react.sumit.controlller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class Allcontroller {
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasAnyAuthority('ROLE_USER', 'ROLE_ADMIN')")
	public String about()
	{
		return "about";
	}
	
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	@GetMapping("/home")
	public String Home()
	{
		return "home";
	}
 
	@GetMapping("/signin")
	public String login(Authentication authentication)
	{
		if(authentication!=null && authentication.isAuthenticated())
		{
			return "redirect:/api/";
		}
		return "login";
	}

}
