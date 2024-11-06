package com.react.sumit.Model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	private String FirstName;
	private String lastname;
	private String Email;
	private String Password;
	private String matchingPassword;

}
