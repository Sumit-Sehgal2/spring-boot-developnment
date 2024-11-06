package com.react.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeAshokIt1CompositePrimaryKeyApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext con=	SpringApplication.run(EmployeeAshokIt1CompositePrimaryKeyApplication.class, args);
personservice per=	con.getBean(personservice.class);
//per.savedata();
per.get();

    
	}

}
