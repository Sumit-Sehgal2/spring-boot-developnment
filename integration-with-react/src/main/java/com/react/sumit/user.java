package com.react.sumit;

import jakarta.persistence.Column;
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
@Table(name = "signup")

public class user {
	
	@Id
	@Column
	private String Email;
	@Column
	private String Fname;
	@Column
	private String Lname;
	@Column
	private String Password;
	

}
