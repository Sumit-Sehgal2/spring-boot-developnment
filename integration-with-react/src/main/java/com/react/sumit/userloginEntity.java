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
@Table(name = "login_details")

public class userloginEntity  {
	@Id
	@Column(name = "Email_Id")
		private String Email;
	@Column(name = "Userpassword")
		private String Password;
		

	}



