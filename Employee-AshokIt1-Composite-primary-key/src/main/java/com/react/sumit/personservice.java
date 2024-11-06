package com.react.sumit;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class personservice {
	@Autowired
	private personRepo personrepo;
	
	public void savedata()
	{
		Composite con=Composite.builder().passportnumber("Tresre36").adharcard(527705204770L).build();
		person p1=person.builder().Age(22).name("Sumit Sehgal").Adress("dehradun").Email("sehglsumit@google.com").salary(2314.56).composite(con).build();
		personrepo.save(p1);
		
	}
	public void get()
	{
		Composite con=Composite.builder().passportnumber("Tresre36").adharcard(527705204770L).build();
		person p1=person.builder().Age(22).name("Sumit Sehgal").Adress("dehradun").Email("sehglsumit@google.com").salary(2314.56).composite(con).build();
		Optional<person> id=personrepo.findById(con);
		if(id.isPresent())
		{
			System.out.println(id);
			
		}
		else {
		System.out.println(id);
		}
	}

}
