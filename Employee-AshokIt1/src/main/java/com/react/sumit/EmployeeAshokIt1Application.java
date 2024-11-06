package com.react.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeAshokIt1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext configure=	SpringApplication.run(EmployeeAshokIt1Application.class, args);
	Employeeservice  emps=configure.getBean(Employeeservice.class);
	//emps.saveall();
	//emps.get();
	emps.getdetaisl();
	
	
	}

}
