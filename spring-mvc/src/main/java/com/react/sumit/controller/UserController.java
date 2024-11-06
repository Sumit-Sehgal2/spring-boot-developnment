package com.react.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.react.sumit.dto.UserDto;
import com.react.sumit.service.Servicess;

@Controller
public class UserController {
	@Autowired
	private Servicess service;
	
	
	@GetMapping("/registrion")
	public String getregister(@ModelAttribute ("UserEntity")UserDto dto)
	{
		return "register";
	}
	
	
	
	@PostMapping("/registrion")
	public String savedetails(@ModelAttribute ("UserEntity")UserDto dto,Model model)
	{
		service.saveuser(dto);
		model.addAttribute("message","registerd sucessfully");
		
		return "register";
		
	}

}
