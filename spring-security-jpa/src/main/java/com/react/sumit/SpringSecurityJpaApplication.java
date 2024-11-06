package com.react.sumit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner commandlinerunner(UserRepo userrepo)
//	{
//		return args->
//		{
//			UserEntity users=new UserEntity();
//			users.setUsername("users");
//			users.setPassword("normalusers");
//			users.setRoles("USER");
//			
//			UserEntity admin=new UserEntity();
//			admin.setUsername("admin");
//			admin.setPassword("normalusers");
//			admin.setRoles("ADMIN");
//		
//			userrepo.saveAll(List.of(users,admin));
//			
//		};
	}

