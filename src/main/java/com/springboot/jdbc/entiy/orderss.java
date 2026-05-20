package com.springboot.jdbc.entiy;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class orderss {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	private String orderType;
	private String orderstatus;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private users user;
	

}
