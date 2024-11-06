package com.react.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeOneToOne2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext configure=	SpringApplication.run(EmployeeOneToOne2Application.class, args);
	 Services service=    configure.getBean(Services.class);
	 service.datainserted();
	 System.out.println("Data Inserted Sucessfully");
	}

}
