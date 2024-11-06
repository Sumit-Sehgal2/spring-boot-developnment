package com.react.sumit;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Employeeservice {
	@Autowired
	Employeerepo employeerepo;
	
//	public String saveEmployee()
//	{
//		Employee emp=Employee.builder()
//				.Employeeid(102)
//				.Employeename("arpit verma")
//				.Empadress("Raipur road")
//				.Emppan("6453ggegbwf")
//				.build();
//		employeerepo.save(emp);
//		return "data inserted sucessufully";
//	}
//	public void saveall()
//	{
//		Employee emp=Employee.builder()
//				//.Employeeid(103)
//				.Employeename("archiit verma")
//				.Empadress("Rajpur road")
//				.Emppan("6453tebswu")
//				.build();
//		Employee emp1=Employee.builder()
//				//.Employeeid(104)
//				.Employeename("roni")
//				.Empadress("Rampuri")
//				.Emppan("6387873g")
//				.build();
//		List<Employee>save=Arrays.asList(emp,emp1);
//		employeerepo.saveAll(save);
//		
//		
//	}
////	public List<Employee>get()
//	{
//		List<Employee>list=employeerepo.findByEmployeename("archiit verma");
//		return list;
//	}
//	public List<Employee> get() {
//	    // Fetching the list of employees by name using the repository method
//	    List<Employee> list = employeerepo.findByEmployeename("archiit verma");
//	    return list;
//	}
	public void getdetaisl()
	{
	List<Employee>emp=	employeerepo.getalldetails();
	emp.forEach(System.out::println);
	}
   
	
	

}
