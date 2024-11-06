package com.react.sumit.Dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.sumit.Entity.EmployeeEntity;

public interface EmployeeRepo  extends JpaRepository<EmployeeEntity,Integer>{
	

}
