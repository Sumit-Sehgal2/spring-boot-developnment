package com.react.sumit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.sumit.entity.Usersignup;
import com.react.sumit.repo.userrepo;

import ch.qos.logback.core.encoder.Encoder;

@Service
public class Userservice {
	
	@Autowired
	private userrepo repo;

	public void saveuser(Usersignup signup) {
		
		Usersignup sign=new Usersignup();
	    sign.setUsername(signup.getUsername());
		sign.setAdharnumber(signup.getAdharnumber());
		sign.setAdress(signup.getAdress());
		sign.setPassword(signup.getPassword());
	repo.save(sign);	
	}
	
 
	
//	private String savedata(Usersignuop signup)
//	{
//		Usersignup sign=new Usersignup();
//		sign.setUsername(signup.getUsername());
//		sign.setAdharnumber(signup.getAdharnumber());
//		sign.setAdress(signup.getAdress());
//		sign.setPassword(signup.getPassword());
//		repo.save(sign);
//		return "data save sucessfully";
//		
//	}

}
