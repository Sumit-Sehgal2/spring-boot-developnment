package com.springboot.jdbc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jdbc.entiy.users;

public interface userrepo extends JpaRepository<users,Integer> {

}
