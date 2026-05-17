package com.react.sumit.all;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("main")
@Primary
public class phonepay implements testste{

	@Override
	public void payment() {
		System.out.println("here phone pay method will call");
		
	}

}
