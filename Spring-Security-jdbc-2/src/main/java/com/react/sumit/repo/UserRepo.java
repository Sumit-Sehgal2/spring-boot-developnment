package com.react.sumit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.react.sumit.Entity.User;
@Repository

public interface UserRepo extends JpaRepository<User,Long> {

}
