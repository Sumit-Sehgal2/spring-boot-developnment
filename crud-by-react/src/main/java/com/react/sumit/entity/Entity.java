package com.react.sumit.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@Table(name = "seek")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  sid;
	private String sname;
	private int age;
	private String dept;

}
