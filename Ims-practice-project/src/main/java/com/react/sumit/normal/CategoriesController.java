package com.react.sumit.normal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @PostMapping("/add")
    public Categories addCategory(@RequestBody Categories category) {
        return categoriesRepository.save(category);
    }

    @GetMapping("/fetch")
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }
    @GetMapping("/fetch/{id}")
    public Optional<Categories> getCategoryById(@PathVariable int id) {
        return categoriesRepository.findById(id);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable int id, @RequestBody Categories categoryDetails) {
        Categories category = categoriesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));

        category.setCategoriesname(categoryDetails.getCategoriesname());
        category.setDescription(categoryDetails.getDescription());

       
        Categories updatedCategory = categoriesRepository.save(category);

     
        return ResponseEntity.ok(updatedCategory);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable int id) {
        if (categoriesRepository.existsById(id)) {
            categoriesRepository.deleteById(id);
            return "Category deleted successfully!";
        } else {
            throw new RuntimeException("Category not found with id: " + id);
        }
    }
}
