package com.react.sumit.running;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class runnn {
	@Autowired
	private testingdb db;
	@Bean
	public  testingdb getdate()
	{
		System.out.println(db);
		return db;
	}

}
