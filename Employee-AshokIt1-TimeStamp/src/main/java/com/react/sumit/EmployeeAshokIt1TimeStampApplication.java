package com.react.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeAshokIt1TimeStampApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext configure =	SpringApplication.run(EmployeeAshokIt1TimeStampApplication.class, args);
	ProductService pros=	configure.getBean(ProductService.class);
	pros.save();
	System.out.println("data Kab ka Save Ho Gaya Bhai");
	}

}
