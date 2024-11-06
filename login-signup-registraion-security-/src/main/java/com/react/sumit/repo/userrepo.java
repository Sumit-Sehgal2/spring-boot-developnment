package com.react.sumit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.sumit.entity.Usersignup;

public interface userrepo extends JpaRepository<Usersignup,Integer> {

}
