package com.react.sumit.config;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.expression.StandardBeanExpressionResolver;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component
public class AppConfig {
	//@Value("#{5*6*2+3}")
	//@Value("#{T(java.lang.Math).abs(new java.util.Random().nextInt())}")
	//@Value("#{'ramesh going to home'.length()>15?'4':'8'}")
	@Value("#{mods.testing.getBytes()}")
	private byte []arr;
	
	
	
	@Scheduled(fixedDelayString =   "2000")
	public void getrandom()
	{
	try{
//		StandardBeanExpressionResolver resolver = new StandardBeanExpressionResolver(); 
//		Integer randomValue = (Integer) resolver.evaluate(valuess, null);
//	
		//System.out.println("value anootation with spel are"+this.arr);
		String arrayContent = Arrays.toString(this.arr);
		System.out.println(arrayContent);
		System.out.println(new Date().toLocaleString());
		
		//System.out.println(new Random().nextInt());
	}
	
	catch (Exception e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
	}
	

	
	}


