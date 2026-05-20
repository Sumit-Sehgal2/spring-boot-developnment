package com.react.sumit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class controller {
	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public ResponseEntity<String>show(@RequestParam("id")Integer id,@RequestParam("name")String name)
	{
		System.out.println("id"+ id +"name"+name);
		ResponseEntity<String>response =new ResponseEntity<String>("id="+id+"name="+name,HttpStatus.OK);
		
		return response;
	}
@RequestMapping(value = "/info/{pid}/{pname}",method = RequestMethod.GET)
	
	public ResponseEntity<String>getinfo(@PathVariable ("pid")Integer pid,@PathVariable ("pname")String pname)
	{
		System.out.println("pid"+pid+"pname"+pname);
		ResponseEntity<String>response=new ResponseEntity<String>("pid="+pid+"pname"+pname,HttpStatus.OK);
		
		return response;
		
	}

}
