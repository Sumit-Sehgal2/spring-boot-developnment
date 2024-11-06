package com.react.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.react.sumit.repo.repo;

@SpringBootApplication
public class CrudRepoImplApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext con=	 SpringApplication.run(CrudRepoImplApplication.class, args);
	repo rep=con.getBean(repo.class);
	rep.saveStudent(232,"sumit sehgal","dehradun","wjhqewuguy@gmail.com",2321.45,232323);
	}

}
