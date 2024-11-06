package com.react.sumit.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.react.sumit.entity.Userentity;
import com.react.sumit.repo.Userrepo;
@Service
public class Userdetailsservices implements UserDetailsService {

	private Userrepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Userentity entity=repo.findByEmail(username);
		
		if(entity==null)
		{
			 throw new UsernameNotFoundException("user not found");
		}
		else
		{
			return new userderta(entity);	
		}
		
		
	}
	/*
	 * Userentity entity=repo.findByEmail(username);
		
	return new User (entity.getemail,entity.getpasswords.Collections.isempty());
	//here User is predefined class provided by spring security and that is implements class of Userdetails
	 * UserDetails userDetails = new User("john@example.com", "password123", Collections.emptyList());
	
		}
		
	 * 
*/
}
