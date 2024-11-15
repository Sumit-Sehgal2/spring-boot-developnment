package com.react.sumit.running;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile({"prod","dev"})
@Component
public class testets  implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println(" i am only for default propertiese");
		
	}

}
