package com.react.sumit;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Composite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class person {
	private int Age;
	private String name;
	private String Adress;
	private double salary;
	private String Email;
	@EmbeddedId
	private Composite composite;
	

}
