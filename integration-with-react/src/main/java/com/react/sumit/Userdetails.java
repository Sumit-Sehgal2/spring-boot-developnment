package com.react.sumit;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Userdetails {
	private String Fname;
	private String Lname;
	private String Email;
	private String Password;

}
