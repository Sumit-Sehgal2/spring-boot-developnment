package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Mycontroller {
	@Autowired
	Businessclass businessclass;
	
	@GetMapping("/get")
	public String get()
	{
		businessclass.getdata();
		return "save data sucessfully";
		
		
	}

}
