package com.react.sumit.config;

import java.util.Date;
import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class AppConfig {
	
	
	@Scheduled(fixedDelayString =   "2000*60*10")
	public void getrandom()
	{
	try{
	
		System.out.println(new Date().toLocaleString());
		System.out.println(new Random().nextInt());
	}
	
	catch (Exception e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
	}
	

	
	}


