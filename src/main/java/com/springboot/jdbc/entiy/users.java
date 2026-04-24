package com.springboot.jdbc.entiy;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	private String username;
	private String contact;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_uid")
	private List<orderss>orders;

}
