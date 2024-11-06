package com.react.sumit.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "heritage")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {
	@Id
	@Column
	private int Empid;
	@Column
	private String Empname;
	@Column
	private String EmpEmail;
	@Column
	private double salery;
	@Column
	private String EmpAdress;
	@Column
	private String Pannumber;

}
