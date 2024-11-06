package com.react.sumit;

import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeOneToOneApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext confi=	SpringApplication.run(EmployeeOneToOneApplication.class, args);
	 Service ser=confi.getBean(Service.class);
	 ser.saveproduct();
	 
	}

}
