package com.react.sumit;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Specification")

public class Specification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ram;
	private String brand;
	private LocalDate mfgdate;
	private LocalDate Experiydate;
	@OneToOne
	@JoinColumn(name = "Product_id")
	private Product product;

}
