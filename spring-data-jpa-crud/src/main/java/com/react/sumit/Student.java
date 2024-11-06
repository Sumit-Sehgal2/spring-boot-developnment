package com.react.sumit;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name = "student id")
	private int id;
	@Column(name = "student name")
	private String name;
	@Column(name = "Student Email")
	private String Email;
	@Column(name = "student course")
	private String course;

}
