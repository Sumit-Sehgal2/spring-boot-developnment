package com.react.sumit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.sumit.entity.Product;
import com.react.sumit.repo.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product create(Product product) {
        return repo.save(product);
    }

    public  List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Product update(Long id, Product product) {
        Product existing = repo.findById(id).orElseThrow();
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
