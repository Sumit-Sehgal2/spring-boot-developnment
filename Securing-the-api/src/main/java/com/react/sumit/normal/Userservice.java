package com.react.sumit.normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	@Autowired
	private Userrepo userrepo;
	@Autowired
	private PasswordEncoder encoder;

	public void savedetails(UserEntity user) {
		
//		String password=encoder.encode(user.getPassword());
//		user.setPassword(password);
		user.setPassword(encoder.encode(user.getPassword()));
		userrepo.save(user);
	}
	
	
	

}
