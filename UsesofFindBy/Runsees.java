//package com.react.sumit.entity;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.hibernate.ResourceClosedException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//@Component
//public class Runsees implements CommandLineRunner {
//	@Autowired
//	private bookrepo repos;
//
////	@Override
////	public void run(String... args) throws Exception {
////		Book book = new Book();
////				book.setAuthor("james Clear");
////		book.setBookcoast(7363.99);
////		book.setBookName("Three Shades of gray");
////		book.setBookType("feresh of mind");
////		//repos.save(book);
////		System.out.println("data Saved Sucessfully");
////	
////		
////		
////		Optional<Book>books=repos.findByAuthorEquals("james Clear");
////	if(books.isPresent())
////		{
////			System.out.println("data is presnent" + books.get());
////		}
////		else
////		{
////			throw new RuntimeException("Data Are not presnet");
////		}
////		Optional<Book> bok=repos.findById(1);
////		if(bok.isPresent())
////		{
////			System.out.println("this is book that you want to get ");
////			System.out.println(bok.get());
////		}
////		
////		else
////		{
////			throw new ResourceClosedException("Book not found");
////		}
////		List<Book>like= repos.findByBookcoast(232.34);
////		like.forEach(System.out::println);
////		if(like.listIterator() != null)
////		{
////			System.out.println(like.get(11));
////		}
////		else
////		{
////			throw new ClassNotFoundException("not able to fetch the recorde");
////		}
//		
//		
//
//@Override
//public void run(String... args) throws Exception {
//	List<Book>liste=repos.findByBookcoastGreaterThanEqual(1.0);
//	//System.out.println("here we are trying to getting the data");
//	//liste.forEach(System.out::println);
//	// TODO Auto-generated method stub
//	//System.out.println("Number of books found: " + liste.size());
//	List<Book>lsu=repos.findByAuthorLike("%e");
//	//lsu.forEach(System.out::println);
//	//System.out.println("here you can get the data that you want");
//	
//	List<Book>oter= repos.findByAuthorLike("___");
//	oter.forEach(test->
//	{
////		System.out.println("here the size of test data" +test.getClass());
////		System.out.println(test);
////		System.out.println("here We are Able to get the Data in such Way");
//	}
//	
//			);
//	List<Book>tests=repos.findByBookcoastLessThanEqualOrAuthorLike(10.0,"%se");
//	//tests.forEach(System.out::println);
//	//System.out.println("here we will get the unexpected Data that we are not Expecting ");
//	
//	List<Book>target=repos.findByBookcoastLessThanEqual(1000.0);
//	
//	target.forEach(System.out::println);
//	target.forEach(items->
//	{
//		System.out.println(" i am the book where value is less than equls to 1000");
//		System.out.println("the size of the target object " +target.size());
//		System.out.println(items.getBookName());
//	}
//			
//			);
////	Optional<Book>testss=repos.findByBookNameLike("%s");
////	if(testss.isPresent())
////	{
////		System.out.println(tests.get(1));
////		System.out.println("this is the Optional that i want to get ");
////	}
//
//	
//}
//		
//		
//		
//		
//			
//				
//				
//		
//		}
//	
////		
//	//}
//
//	
//	
//
//
