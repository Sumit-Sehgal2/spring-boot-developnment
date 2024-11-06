package com.react.sumit.service;

import com.react.sumit.dto.UserDto;
import com.react.sumit.model.UserEntity;
import com.react.sumit.repo.repository;

@org.springframework.stereotype.Service

public class Servicess {
	private repository repo;
	
	
	public void saveuser(UserDto user)
	{
		UserEntity users=new UserEntity();
		users.setEmail(user.getEmail());
		users.setFullname(user.getFullname());
		users.setPassword(user.getPassword());
		users.setRole(user.getRole());
		repo.save(users);
		System.out.println(users);
	}

}
