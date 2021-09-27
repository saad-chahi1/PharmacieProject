package com.pharmacie.controller;

import com.pharmacie.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
}
