package com.react.sumit;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.react.sumit.te.teste;

@SpringBootApplication
public class NormalApplication  implements CommandLineRunner{
	
	@Bean
	public LocalDateTime gettime()
	{
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
	ApplicationContext context=	 SpringApplication.run(NormalApplication.class, args);
teste taste=	context.getBean(teste.class);
  System.out.println(taste.getwish("ramesh"));
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hhbdeb");
		System.out.println("hello is this command line runner");
		
	}

}
