package com.react.sumit.normal;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Categories")
public class Categories{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CategoryId;
	@Column(name = "Categories_Name")
	private String Categoriesname;
	@Column(name = "created_by")
	private String CreatedBy;
	@Column(name = "Descrption")
	private String description;
	@Column(name = "Date of creation")
    private LocalDateTime createdAt;
	
	 @PrePersist
	    protected void onCreate() {
	        this.createdAt = LocalDateTime.now();  
	    }
	
	
	

}
