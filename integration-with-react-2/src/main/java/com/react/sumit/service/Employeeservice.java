package com.react.sumit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.sumit.Dto.EmployeeDto;
import com.react.sumit.Dto.EmployeeRepo;
import com.react.sumit.Entity.EmployeeEntity;
@Service
public class Employeeservice {
	@Autowired
	EmployeeRepo repo;

	public String  savedetails(EmployeeDto emp) {
		EmployeeEntity emps=new EmployeeEntity();
		emps.setEmpid(emp.getEmpid());
		emps.setEmpname(emp.getEmpname());
		emps.setEmpEmail(emp.getEmpEmail());
		emps.setEmpAdress(emp.getEmpAdress());
		emps.setSalery(emp.getSalery());
		emps.setPannumber(emp.getPannumber());
		repo.save(emps);
		
		
		return "Data Save Sucessfully";
		
		
		
	}

	

}
