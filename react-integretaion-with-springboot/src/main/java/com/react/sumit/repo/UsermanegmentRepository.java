package com.react.sumit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsermanegmentRepository  extends JpaRepository<userdetails,String>{

}
