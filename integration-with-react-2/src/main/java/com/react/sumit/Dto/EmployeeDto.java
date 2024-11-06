package com.react.sumit.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {
	private int Empid;
	private String Empname;
	private String EmpEmail;
	private double salery;
	private String EmpAdress;
	private String Pannumber;
	

}
