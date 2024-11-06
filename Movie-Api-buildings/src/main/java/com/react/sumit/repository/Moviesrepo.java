package com.react.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.sumit.Entity.Movies;

public interface Moviesrepo extends JpaRepository<Movies,Integer> {

}
