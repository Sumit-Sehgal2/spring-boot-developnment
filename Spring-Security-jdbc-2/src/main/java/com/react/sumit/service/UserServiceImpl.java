package com.react.sumit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.react.sumit.Entity.User;
import com.react.sumit.Model.UserModel;
import com.react.sumit.repo.UserRepo;
import com.react.sumit.sebconfi.MyConfig;

@Service

public class UserServiceImpl  implements UserService{
	@Autowired
	private UserRepo userrepo;
	@Autowired
	private PasswordEncoder passwordencoder;
	

	@Override
	public User rigisterUser(UserModel usermodel) {
		User user=new User();
		user.setEmail(usermodel.getEmail());
		user.setFirstName(usermodel.getFirstName());
		user.setLastname(usermodel.getLastname());
		user.setRole("USER");
		user.setPassword(passwordencoder.encode(usermodel.getPassword()));
		userrepo.save(user);
		return user;
	}

}
