package com.react.sumit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.sumit.entity.Entity;

public interface StudentRepo extends JpaRepository<Entity,Integer> {

}
