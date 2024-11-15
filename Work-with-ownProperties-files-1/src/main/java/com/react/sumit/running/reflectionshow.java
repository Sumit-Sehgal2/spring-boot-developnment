package com.react.sumit.running;

import java.lang.reflect.Method;

public class reflectionshow {
	
	
	public static void main(String[]args)
	{
		personsdata person= new personsdata();
		
		Class<?>noname=person.getClass();
		System.out.println(noname);
		// this is done with the help of reflection 
		
		
		Method[]method=noname.getDeclaredMethods();
		for(Method methods:method)
		{
			System.out.println(methods.getName());
		}
		//this is is the i=concept of reflection 
		
	}

}
