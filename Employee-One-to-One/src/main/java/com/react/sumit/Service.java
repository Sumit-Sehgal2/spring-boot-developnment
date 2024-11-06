package com.react.sumit;

import java.time.Clock;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service

public class Service {
	@Autowired
	private Productrepo prepo;
	@Autowired
	private Specirepo sperepo;
	

	public void saveproduct()
	{
		Specification spec=Specification.builder().brand("Lenovo").mfgdate(LocalDate.now()).Experiydate(LocalDate.now().plusDays(10)).build();
		Product p1=Product.builder().ProductLocation("dehradun").ProductName("Msi").build();
		
		p1.setSpecification(spec);
		spec.setProduct(p1);
		prepo.save(p1);
		sperepo.save(spec);
		
	}
}
