package com.react.sumit.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "submit")
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private String adress;
	private String username;
	private double slaery;
	private long adharnumber;

}
