package com.react.sumit.normal;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aops {

    // Define the Pointcut for the 'save' method
    @Pointcut("execution(public * com.react.sumit.normal.Aops.save(..))")
    public void m1() {
    }

    // Advice that runs before the method matched by the pointcut
    @Before("m1()")
    public void s2() {
        System.out.println("I am throwing an error before the save method execution");
    }

    // Define the 'save' method to match the pointcut
    public void save() {
        System.out.println("Inside save method");
    } 
}
