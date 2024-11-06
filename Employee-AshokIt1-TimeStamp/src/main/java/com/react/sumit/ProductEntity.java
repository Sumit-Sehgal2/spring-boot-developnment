package com.react.sumit;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Product")

public class ProductEntity {
	@Id
	@Column(name = "productId")
	private Integer Pid;
	private String Pname;
	private double Pprice;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate currentdate;
	@UpdateTimestamp
	@Column(insertable = false)
	
	private LocalDate updateddate;

}
