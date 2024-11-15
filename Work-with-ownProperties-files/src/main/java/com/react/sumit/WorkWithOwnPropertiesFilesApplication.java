package com.react.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.react.sumit.impls.mainss;

@SpringBootApplication
public class WorkWithOwnPropertiesFilesApplication {

	public static void main(String[] args) {
	ApplicationContext ap=	SpringApplication.run(WorkWithOwnPropertiesFilesApplication.class, args);
mainss mainsss=	ap.getBean(mainss.class);
mainsss.show(); 
	}

}
