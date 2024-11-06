package com.react.sumit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaCrudApplication {

	public static void main(String[] args) {
	  ApplicationContext con=	SpringApplication.run(SpringDataJpaCrudApplication.class, args);
	  Scanner sc=new Scanner(System.in);
	  
	  studentrepo student=  con.getBean(studentrepo.class);
	  Student s1=new Student();
	  Syste
	  s1.setId(sc.nextInt());
	  
	  
	}

}
