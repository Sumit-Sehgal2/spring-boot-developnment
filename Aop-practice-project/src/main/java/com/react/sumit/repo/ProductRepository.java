package com.react.sumit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.react.sumit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
