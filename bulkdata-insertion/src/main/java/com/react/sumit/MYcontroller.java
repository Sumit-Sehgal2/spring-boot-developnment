package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api")
public class MYcontroller {
	@Autowired
	private reposi repo;
	
	@PostMapping("/save")
	public ResponseEntity<String>savedata(@RequestBody List<Student>student)
	{
	
		
		List<Student> text=repo.saveAll(student);
		return new ResponseEntity<String>("data save sucessfully",HttpStatus.OK);	
	}

}
