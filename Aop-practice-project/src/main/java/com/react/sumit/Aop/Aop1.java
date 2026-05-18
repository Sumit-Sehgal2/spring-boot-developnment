package com.react.sumit.Aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Aspect
public class Aop1 {
	
	
	@Pointcut("execution(* com.react.sumit.service.*.*(..))")
	public void servicemethod()
	{
		System.out.println("here we are calling the pointcut");
	}
	
	@Around("servicemethod()")
	  public Object  beforeAndAfters(ProceedingJoinPoint point) throws Throwable
    {
		long start= System.currentTimeMillis();
	Object term=point.proceed();
		long end=System.currentTimeMillis();
		Object result=start-end;
		System.out.println("here execution time is " + result);
		return term;
    }
	
	@Before("servicemethod()")
	public void getthedata()
	{
		System.out.println("here we are calling the method");
		
	}
	@After("servicemethod()")
	public void getafter()
	{
		System.out.println("sucessfully execute the method");
	}
	
	@Around("servicemethod()")
     public Object  beforeAndAfter(ProceedingJoinPoint point) throws Throwable
     {
		System.out.println("here we are calling the method ");
		System.out.println("method name ->>" + point.getSignature().getName());
		//String name=Arrays.toString(point.getArgs());
		Object obj=point.proceed();
		System.out.println("here we are exist with this method ");
		return obj;
     }
	@AfterReturning("servicemethod()")
	public void getreturnning()
	{
		System.out.println("here we are returning the value after sucessfully termination");
	}
	
	@AfterThrowing("servicemethod()")
	public void throwing()
	{
		System.out.println("here error is commes ");
	}

}
