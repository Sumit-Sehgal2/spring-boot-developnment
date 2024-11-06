package com.react.sumit.normal;

import java.util.HashSet;
import java.util.Set;

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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "userdetailsservice",uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class UserEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String username;
	private String password;
	private Set<String>roles=new HashSet<>();
	//hash a=set and linkekd hash set both have differrent functionlity both linked hash set maintain the insertion order where as hash set are faster than linked hashset
	
}
