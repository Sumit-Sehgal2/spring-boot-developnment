package com.react.sumit.normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private Userservice userservice;
	
	@PostMapping("/save")
	public ResponseEntity<String>save( @RequestBody UserEntity user)
	{
		userservice.savedetails(user);
		return new ResponseEntity<String>("data saved sucessfully",HttpStatus.OK);
		
	}

}
