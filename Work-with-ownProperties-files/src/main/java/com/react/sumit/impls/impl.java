package com.react.sumit.impls;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@ConfigurationProperties(prefix = "myapp")
@Data
@Component
public class impl {
	
	private String name;
	private List<String>list;
	private Map<String,String>map;
	
	 
	
	

}
