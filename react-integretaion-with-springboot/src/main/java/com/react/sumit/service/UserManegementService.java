package com.react.sumit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.sumit.dto.UserDetails;
import com.react.sumit.repo.UsermanegmentRepository;
import com.react.sumit.repo.userdetails;

@Service
public class UserManegementService {
	@Autowired
	UsermanegmentRepository usermanegemntrepo;

	public String createUser(UserDetails userdetails) {
		userdetails user=new userdetails();
		user.setEmailid(userdetails.getEmailid());
		user.setEmailid(userdetails.getFirstname());
		user.setLastname(userdetails.getLastname());
		user.setPassword(userdetails.getPassword());
		
		usermanegemntrepo.save(user);
		return "user Signup";
	}

}
