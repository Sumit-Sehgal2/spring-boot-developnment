package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private UserService service;
	@PostMapping("/save")
	private String savedata(@RequestBody UserEntity user)
	{
		service.saveuser(user);
		return "save data sucessfully";
		
		
	}

}
