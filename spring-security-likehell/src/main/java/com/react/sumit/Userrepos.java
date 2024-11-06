package com.react.sumit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepos  extends JpaRepository<Entityss,Integer>{

    public 	Entityss findByUsername(String username);

}
