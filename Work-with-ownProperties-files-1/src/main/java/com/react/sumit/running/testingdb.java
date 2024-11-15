package com.react.sumit.running;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@ConfigurationProperties("my.app")
@Component
@Data
public class testingdb {
	//@Value("com.oracle.ping")
	private String db;
	//@Value("simkldhh")
	private String password;

}
