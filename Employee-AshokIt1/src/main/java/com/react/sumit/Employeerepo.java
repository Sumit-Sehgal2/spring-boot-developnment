package com.react.sumit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface Employeerepo  extends JpaRepository<Employee,Integer>{
	
	
	//public List<Employee> findByEmployeename(String  Employeename);
	@Query("from Employee")
	public List<Employee>getalldetails();
	@Query("from Employee where Employeeid:Employeeid")
	public Employee getEmpbyid(Employee Employeeid);

}
