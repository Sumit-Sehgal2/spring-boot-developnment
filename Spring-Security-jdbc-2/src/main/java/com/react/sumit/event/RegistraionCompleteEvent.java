package com.react.sumit.event;

import org.springframework.context.ApplicationEvent;

import com.react.sumit.Entity.User;

public class RegistraionCompleteEvent  extends ApplicationEvent{

	public RegistraionCompleteEvent(User user,String applicationurl) {
		super(user);
		// TODO Auto-generated constructor stub
	}

}
