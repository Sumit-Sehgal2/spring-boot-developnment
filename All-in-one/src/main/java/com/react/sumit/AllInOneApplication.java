package com.react.sumit;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AllInOneApplication {
	
	static Logger log= Logger.getLogger(AllInOneApplication.class);

	public static void main(String[] args) {
		
		log.debug("this is the debugg message");
		log.info("this is the info warn");
		log.trace("this is the trace message ");
		SpringApplication.run(AllInOneApplication.class, args);
	}

}
