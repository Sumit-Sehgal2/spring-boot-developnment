package com.react.sumit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class ProductService {
	@Autowired
	ProductRepo product;
	
	
	public void save()
	{
		ProductEntity products=ProductEntity.builder().Pid(103).Pname("Monitor").Pprice(458000.30).build();
		ProductEntity pro=product.save(products);
		System.out.println("data insertd sucessfully");
		
		
	}

}
