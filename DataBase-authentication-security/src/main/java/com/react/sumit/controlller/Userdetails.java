package com.react.sumit.controlller;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Userauthenctucation",uniqueConstraints =@UniqueConstraint(columnNames = "username"))
public class Userdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	@UniqueElements(message = "user name already exist")
	private String username;
	private String role;
	private String Password;
	private Long adharnumber;
	private String adress;

}
