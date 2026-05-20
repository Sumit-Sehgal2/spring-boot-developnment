package com.react.sumit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class mycontroller {
	@RequestMapping(value = "/dataa",method = RequestMethod.GET)
	public ResponseEntity<String>getdata(@RequestParam("username")String username,@RequestParam("Email")String Email)
	
	{
		System.out.println("username"+username+"Email"+Email);
		ResponseEntity<String>response=new ResponseEntity<String>("username"+username+"Email"+Email,HttpStatus.OK);
		return response;
		
	}
	@RequestMapping(value = "/datab/{username}/{Email}",method = RequestMethod.GET)
	public ResponseEntity<String>getinfo(@PathVariable("username")String username,@PathVariable("Email")String Email)
	{
		System.out.println("username"+username+"Email"+Email);
		ResponseEntity<String>response=new ResponseEntity<String>("username"+username+"Email"+Email,HttpStatus.OK);
		return response;
		
	}

}
