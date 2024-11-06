package com.react.sumit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.react.sumit.entity.Entity;
import com.react.sumit.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	
	public Entity savedetails(Entity entity)
	{
		return repo.save(entity);
		
		
		
	}
    public List<Entity>getall()
    
    {
    	return repo.findAll();
	}
	public Entity updatedetails(Entity entity) {
		Optional<Entity> getdet=repo.findById(entity.getSid());
		Entity getall=getdet.get();//finally yahn pe data sarra ayaa gaya 
		getall.setAge(entity.getAge());
		getall.setDept(entity.getDept());
		getall.setSname(entity.getSname());
		return repo.save(getall);
		
		
	}
	
	public boolean deletedate(int id)
	{
		repo.deleteById(id);
		return true;
	}
	

}
