package com.react.sumit;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Usermaneger" ,uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int userid;
	private String email;
	private String password;

}
