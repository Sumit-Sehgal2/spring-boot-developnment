package com.react.sumit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ashok_it")
@Builder

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int Employeeid;
	private String Employeename;
	private String Empadress;
	private String Emppan;
	private long mobile;

}
