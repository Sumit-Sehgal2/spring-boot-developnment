package com.react.sumit;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class userdetailss implements UserDetails {
	@Autowired
	private Entityss entity;
	
	
	public userdetailss(Entityss entity)
	{
		this.entity=entity;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authorites= new SimpleGrantedAuthority(entity.getRoles());
		return Arrays.asList(authorites);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return entity.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return entity.getPassword();
	}

}
