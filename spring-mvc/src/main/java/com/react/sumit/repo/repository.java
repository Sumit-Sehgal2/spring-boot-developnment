package com.react.sumit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.react.sumit.model.UserEntity;
@Repository
public interface repository  extends JpaRepository<UserEntity,Long>{

}
