package com.react.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.react.sumit.entity.Usersignup;
import com.react.sumit.service.Userservice;

@Controller
@RequestMapping("/api")
public class usercontroller {
	@Autowired
	private Userservice service;
	
	
	@GetMapping("/signup")
	public String showSignupForm(Model model) {
	    model.addAttribute("usersignup", new Usersignup());
	    return "signup"; // Returns the Thymeleaf template for signup form
	}
	
	@PostMapping("/signup")
	public String savedata(@ModelAttribute Usersignup signup)
	{
		service.saveuser(signup);
		return "sucess";
		
	}

}
