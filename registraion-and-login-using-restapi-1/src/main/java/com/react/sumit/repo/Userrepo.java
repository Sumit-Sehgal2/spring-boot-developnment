package com.react.sumit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.sumit.entity.Userentity;

public interface Userrepo  extends JpaRepository<Userentity,Integer>{
	
	public Userentity findByEmail(String email);

}
