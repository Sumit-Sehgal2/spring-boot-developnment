package com.react.sumit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface personRepo extends JpaRepository<person,Composite> {
	//public List<Composite>

}
