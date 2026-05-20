package com.springboot.jdbc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jdbc.entiy.orderss;
@Repository
public interface ordersrepo extends JpaRepository<orderss,Integer>{

}
