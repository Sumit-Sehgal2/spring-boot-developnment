package com.cartapplication.dreamshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Categories {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
private Long id;
private String name;
@OneToMany(mappedBy = "categories")
private List<Product>products;

}
