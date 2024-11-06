package com.react.sumit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<ProductEntity, Integer>{
	

}
