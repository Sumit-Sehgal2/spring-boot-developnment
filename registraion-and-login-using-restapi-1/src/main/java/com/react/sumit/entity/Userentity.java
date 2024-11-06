package com.react.sumit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usersignup")
public class Userentity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private Integer userid;
	private String email;
	private String name;
	private String passwords;
	private Long phnenumber;

}
