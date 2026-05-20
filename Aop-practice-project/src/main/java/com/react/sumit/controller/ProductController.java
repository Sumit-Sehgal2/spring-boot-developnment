package com.react.sumit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.sumit.entity.Product;
import com.react.sumit.repo.ProductRepository;
import com.react.sumit.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;
    @Autowired
    private ProductRepository productrepo;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }
    @PostMapping("/list")
    public ResponseEntity<List<Product>>saveall(@RequestBody List<Product>product)
    {
    	
    	List<Product>geta=service.getAll();
    	System.out.println(geta);
   List<Product>products= 	productrepo.saveAll(product);
    	return new ResponseEntity<List<Product>>(products,HttpStatus.ACCEPTED);
    }

    @GetMapping
    private List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted";
    }
}

