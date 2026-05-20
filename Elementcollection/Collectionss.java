package com.react.sumit.Entity;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Collectionss implements CommandLineRunner {
	@Autowired
	private Collectionre repos;

	@Override
	public void run(String... args) throws Exception {
		
		Product pro= new Product();
		pro.setProdId(1);
		pro.setProdcode("Pen");
		pro.setColors(Arrays.asList("red","green","Blue","Yellow"));
		Set<String>set= new LinkedHashSet<>();
		set.add("link");
		set.add("glycer");
		set.add("reno");
		set.add("cello");
		pro.setModels(set);
		Map<String,String>map= new LinkedHashMap<>();
		map.put("link","10");
		map.put("cello","20");
		map.put("reno","231");
		pro.setDetails(map);
		
		repos.save(pro);
		System.out.println("here We save our Data Sucessfullly");
		
		
		
		
	}

}
