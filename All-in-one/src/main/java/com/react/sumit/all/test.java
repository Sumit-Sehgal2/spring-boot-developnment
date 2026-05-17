package com.react.sumit.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class test {
	@Autowired
//	@Qualifier(value = "phonepay.class")
	private testste tatse;
	@GetMapping
	public String response()
	{
		tatse.payment();
		return "data fetched";
		
	}

}
