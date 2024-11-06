package com.react.sumit;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
	
	@Autowired
	private productrepo product;
	@Autowired
	private specrepo specifiction;
	public void datainserted() {
	    Product pro = Product.builder()
	        .productName("Laptop")
	        .productLocation("Singapore")
	        .mfgdate(LocalDate.now())
	        .Expdate(LocalDate.now())
	        .build();

	    Specification specify = Specification.builder()
	        .brand("Lenovo")
	        .model("test372")
	        .build();

	    // Set the bidirectional relationship
	    pro.setSpecify(specify);
	    specify.setProduct(pro);

	    // Save only the Product; Cascade will handle the Specification save
	    product.save(pro);

	    System.out.println("Data Inserted Successfully");
	}


}
