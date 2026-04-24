package com.react.sumit.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Queryrun  extends JpaRepository<Book,Integer>{
	
	@Query("select bookName from Book e")
	List<String>getallbookname();
	@Query("select e from Book e")
	List<Book>getallrecord();
	@Query("select bookName,author from Book e")
	List<Object[]>getnameandauthor();
	//@Query("select e bookname from Book e where e.booId=?1")
	//@Query("select e from Book e where e.bookId = ?1")
	@Query("select e.bookName from Book e where e.booId =:id")
	Optional<String>getbyname(Integer id);
	//@Query("select e.author from Book e where booId=?1 and bookcoast=?2 and bookType=?3")
	@Query("select e.author from Book e where e.booId = :id and e.bookcoast = :bookcoast and e.bookType = :bookType")
	Optional<String> getOnlyName(@Param("id") Integer id, @Param("bookcoast") Double bookcoast, @Param("bookType") String bookType);
	//@Query("select a.bookcoast from Book a where a.bookName=?1 and a.booId=?2")
	@Query("select a.bookcoast from Book a where a.bookName=:bookName and a.booId=:booId")
	Optional<Double>getonlycoast(@Param("bookName")String  bookName,@Param("booId")Integer booId);

	
	
	
	

}
