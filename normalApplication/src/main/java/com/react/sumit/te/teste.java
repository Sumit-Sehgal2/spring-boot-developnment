package com.react.sumit.te;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("test")
public class teste {
	@Autowired
	private LocalDateTime time;
	
	//int Hour=time.getHour()
	
	public String getwish(String user)
	{
		var  Hour=time.getHour();
		if(Hour<=12)
		{
			return "good morning"+user;
		}
		else if (Hour<=16) {
			return "good Afternoon"+user;
			
		}
		else if(Hour<23)
		{
			return "good night"+user;
		}
		else
		{
			return "not valid";
		}
		
	}

}
