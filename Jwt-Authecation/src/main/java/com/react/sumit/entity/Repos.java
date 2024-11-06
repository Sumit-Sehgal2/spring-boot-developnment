package com.react.sumit.entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repos  extends JpaRepository<UserEntity,Integer>{
	
	
	 Optional<UserEntity>findByEmail(String email);

}
