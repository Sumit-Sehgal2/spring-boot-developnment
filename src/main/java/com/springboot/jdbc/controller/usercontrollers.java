package com.springboot.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jdbc.entiy.users;
import com.springboot.jdbc.repo.userrepo;

@RestController

public class usercontrollers {
	@Autowired
	private userrepo user;
	
	@GetMapping("/get")
	public List<users>getuserinfo()
	{
		return user.findAll();
	}
	@PostMapping("/save")
	public users saveuserinfo(@RequestBody users info) {
		return user.save(info);
	}
	
	@GetMapping("/get/{uid}")
	public users getuserbyid(@PathVariable int uid)
	{
		return user.findById(uid).orElseThrow(()-> new RuntimeException("user not found"));
		
	}
	@DeleteMapping
	public ResponseEntity<String>deletebyid(@RequestParam Integer uid)
	{
	user.deleteById(uid);
		return new ResponseEntity<String>("data delete sucessfully",HttpStatus.ACCEPTED);
	}
	


}
