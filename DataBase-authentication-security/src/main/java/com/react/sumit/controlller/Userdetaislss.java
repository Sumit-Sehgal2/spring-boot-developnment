package com.react.sumit.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class Userdetaislss implements UserDetailsService {
	
	@Autowired
	private Userrepo userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Userdetails users=	userrepo.findByUsername(username);
	
	if(users==null)
	{
		 throw new UsernameNotFoundException("USer not found ");
	}
	else
	{
		return new Configurations(users);
	}
	
	
	

}
}
//
//@Override
//public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//    Userdetails user = userrepo.findByUsername(username); // Fetching user from repository
//    
//    if (user == null) {
//        throw new UsernameNotFoundException("User not found");
//    }
//
//    // Return a Spring Security User with username, password and roles
//    return org.springframework.security.core.userdetails.User
//            .withUsername(user.getUsername())
//            .password(user.getPassword())
//            .authorities(Collections.singletonList(new SimpleGrantedAuthority(user.getRole())))
//            .build();
//}
//}
