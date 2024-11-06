package com.react.sumit.controlller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Configurations implements UserDetails {
	
	@Autowired
	private Userdetails details;

	public Configurations(Userdetails users) {
	this.details=users;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority =new SimpleGrantedAuthority(details.getRole());
		List<SimpleGrantedAuthority>list=new ArrayList<>();
		list.add(authority);
		return list;
	}

	@Override
	public String getPassword() {
		String users=details.getPassword();
		return users;
	}

	@Override
	public String getUsername() {
		
		return details.getUsername();
	}
	
	

}
