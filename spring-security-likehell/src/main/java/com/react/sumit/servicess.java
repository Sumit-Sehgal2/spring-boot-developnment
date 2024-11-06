package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
@Component
public class servicess  implements UserDetailsService{
	@Autowired
	private Userrepos repos;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Entityss user=repos.findByUsername(username);
	if(user==null)
	{
		throw new UsernameNotFoundException("user not found");
	}
	else
	{
		return new userdetailss(user);
	}
		
	}

}
