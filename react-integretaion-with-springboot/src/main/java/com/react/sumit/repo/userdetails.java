package com.react.sumit.repo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="sumit_table")


public class userdetails {
	@Id
	@Column
	private String emailid;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	
	private String password;

}
