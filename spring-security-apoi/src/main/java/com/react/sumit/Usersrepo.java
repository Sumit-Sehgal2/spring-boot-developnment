package com.react.sumit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Usersrepo extends JpaRepository<Users,Integer> {

	//Users findbyusername(String username);

	Users findByemail(String username);
	

}
