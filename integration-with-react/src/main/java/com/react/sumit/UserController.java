package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserService userservice;
	@PostMapping("/users")
	public ResponseEntity<String>savedata(@RequestBody Userdetails user)
	{
		String result=userservice.createdata(user);
	  return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}
	public ResponseEntity<Userdetails>Loginform(@RequestBody UserLogin userlogin)
	{
		Userdetails user=UserService.getLogin(userlogin);
		return new ResponseEntity<Userdetails>(user,HttpStatus.OK);
	}

}
