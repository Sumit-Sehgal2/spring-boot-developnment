package com.react.sumit;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Ascpectclass {
    @Pointcut("execution(public * com.react.sumit.Businessclass.getdata())")
	public void connect() {};
	
	@Before("connect()")
	public void Aopme()
	{
		System.out.println("Hello i am aop additional method");
	}

}
