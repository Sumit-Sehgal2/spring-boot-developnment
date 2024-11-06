package com.react.sumit.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.react.sumit.pojo.Student;

import jakarta.transaction.Transactional;

public interface repo extends CrudRepository<Student, Integer> {

    @Modifying
    @Transactional
    @Query("INSERT INTO submit (stuid, sname, adress, username, slaery, adharnumber) VALUES (:sid, :sname, :adress, :username, :slaery, :adharnumber)")
    int saveStudent(
            @Param("sid") int sid,
            @Param("sname") String sname,
            @Param("adress") String adress,
            @Param("username") String username,
            @Param("slaery") double slaery,
            @Param("adharnumber") long adharnumber);
}
