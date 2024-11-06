package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class usercont {
	@Autowired
	private Usersrepo userrepo;
	@Autowired
	private PasswordEncoder password;
	
	
	@PostMapping("/user")
	public ResponseEntity<String>data(@RequestBody Users user)
	{
		user.setPassword(password.encode(user.getPassword()));
	
		userrepo.save(user);
		return new ResponseEntity<String>("data saves Sucessfully",HttpStatus.OK);
	}
	
	
	
	
}
