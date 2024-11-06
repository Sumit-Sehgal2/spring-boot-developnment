package com.react.sumit.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.react.sumit.entity.Userentity;

public class userderta  implements UserDetails{
	
	private Userentity entity;
	
	public userderta(Userentity entity)
	{
		this.entity=entity;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public String getPassword() {
		
		return entity.getPasswords();
	}

	@Override
	public String getUsername() {
		
		return entity.getEmail();
	}

}
