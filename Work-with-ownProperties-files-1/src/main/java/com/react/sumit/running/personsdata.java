package com.react.sumit.running;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class personsdata {
	private int age;
	private String name;
	private Long ADHAR;
	
	
	
	public void showmethod()
	{
		System.out.println(" i am an method of person");
	}
	
	public void getdata()
	{
		System.out.println(" i am another method of an person method");
	}
	

}
