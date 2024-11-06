package com.react.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.sumit.entity.Entity;
import com.react.sumit.service.StudentService;

@RestController
@RequestMapping("crud")
public class Mycontroller {
	@Autowired
	private StudentService myservice;
	
	@PostMapping("/save")
	public Entity createuser(@RequestBody Entity entity)
	{
		
		Entity entity1=myservice.savedetails(entity);
		
		return entity1;
	}
	@GetMapping("/get")
	public List<Entity> getdetails()
	{
	List<Entity>list=	myservice.getall();
	
	       return list;
			
	}
	@PostMapping("/update")
	public Entity update(@RequestBody Entity entity)
	{
		Entity get=myservice.updatedetails(entity);
		return get;
	}
	
	@GetMapping("/delete/{id}")
	public boolean deletedata(@PathVariable int id)
	{
		myservice.deletedate(id);
		return false;
		
	}
	

	

}
