package com.pharmacie.controller;

import com.pharmacie.exception.ResourceNotFoundException;
import com.pharmacie.model.Product;
import com.pharmacie.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping("/products")
    @CrossOrigin(origins = "http://localhost:4200")
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    // get employee by id rest api
    @GetMapping("/products/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        return ResponseEntity.ok(product);
    }


}
