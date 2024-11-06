package com.react.sumit.controlller;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface Userrepo  extends JpaRepository<Userdetails,Integer>{

	public Userdetails  findByUsername(String username);
}
