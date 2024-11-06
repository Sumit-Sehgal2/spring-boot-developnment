package com.react.sumit.userrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.react.sumit.Entity.UserEntity;
@Repository

public interface myrepo extends JpaRepository<UserEntity,Long> {

}
