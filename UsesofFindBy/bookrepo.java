//package com.react.sumit.entity;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//@Repository
//public interface bookrepo extends JpaRepository<Book,Integer> {
//	
//	
//	Optional<Book>findByAuthor(String Author);
//	Optional<Book> findByauthorIs(String author);
//	Optional<Book>findByAuthorEquals(String author);
//	Optional<Book>findById(Integer BooId);
//	List<Book>findByBookcoast(Double bookcoast);
//	List<Book>findByBookcoastGreaterThanEqual(Double bookcoast);
//	List<Book>findByAuthorLike(String author);
//	//Optional<Book>findByAuthorLike(String author)
//	List<Book>findByBookcoastLessThanEqualOrAuthorLike(Double bookcoast,String author);
//	//List<Book> findByBookcoastLessThanEqualOrAuthorLike(Double bookcoast, String author);
//	List<Book>findByBookcoastLessThanEqual(Double bookcoast);
//	Optional<Book>findByBookNameLike(String expression);
//
//	
//
//}
