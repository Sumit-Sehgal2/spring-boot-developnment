package com.react.sumit.entity;

import java.util.AbstractMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class QueryrunnerPractice implements CommandLineRunner {
	
	@Autowired
	private Queryrun query;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//List<String>get=query.getallbookname();
		List<Book>get=query.getallrecord();
		//System.out.println("here we are only fetching the book name ");
		get.forEach(bookname->{
			//System.out.println("the total number of record" +get.size());
			//System.out.println(bookname);
		});
//		query.getnameandauthor()
//		.stream().map(obj->obj[0] +":" +obj[1])
//		.forEach(System.out::println);
//		System.out.println("here we are getting only two column ");
		
		

query.getnameandauthor()
    .forEach(obj -> {
        // Create a key-value pair (name, author)
        AbstractMap.SimpleEntry<String, String> entry = new AbstractMap.SimpleEntry<>((String) obj[0], (String) obj[1]);
        
        // Print the key-value pair
     //   System.out.println(entry.getKey() + ":" + entry.getValue());
    });
    //System.out.println("Here we are getting only two columns.");
    Optional<String>testss= query.getbyname(101);
    if(testss.isPresent())
    {
    	//System.out.println(testss.get());
    }
    else
    {
    	throw new RuntimeException("we are unable to fetching the book record");
    }
    
    Optional<String>gets=query.getOnlyName(104,220.0,"Classic");
    if(gets.isPresent())
    {
//    	System.out.println(gets.get());
//    	System.out.println("52667898765434567876543");
    }
    //System.out.println("fdxgchjklgfdgfhjkljhgfhdhjkgfdsgdhfgjkhuytr");
    
    Optional<Double>getdoub=query.getonlycoast("The Catcher in the Rye",103);
    if(getdoub.isPresent())
    {
    	System.out.println("the orignnal price you wnat to fetch that i will give you");
    	System.out.println(getdoub.get());
    	System.out.println("i think now you will get the respective result");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
	

}
