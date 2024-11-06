package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private UserRepo userrepo;
	
	public void saveuser(UserEntity user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		userrepo.save(user);
		
		
	}

}
