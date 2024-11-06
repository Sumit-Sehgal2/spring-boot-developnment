package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {
	@Autowired
	 impljpa impl;

	public String createdata(Userdetails user) {
		user users=new user();
		users.setEmail(user.getEmail());
		users.setFname(user.getFname());
		users.setLname(user.getLname());
		users.setPassword(user.getPassword());
		impl.save(users);
		
		return "users registerd sucessfully";
	}

	public  Userdetails getLogin(UserLogin userlogin) {
		userloginEntity users1=new userloginEntity();
		users1.setEmail(userlogin.getEmail());
		users1.setPassword(userlogin.getPassword());
		impl.save(users1);
	
		
		return Userdetails;
	}

}
