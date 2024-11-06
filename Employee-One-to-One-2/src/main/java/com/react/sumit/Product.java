package com.react.sumit;

import java.time.LocalDate;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "product_id")
    private int productId;

    private String productName;
    private String productLocation;
    private LocalDate mfgdate;
    private LocalDate Expdate;

    // Define cascade type here if Product is the one initiating the save operation
    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)// Owning side
    private Specification specify;
}
