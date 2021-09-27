package com.pharmacie;

import com.pharmacie.model.Category;
import com.pharmacie.model.Product;
import com.pharmacie.repository.CategoryRepository;
import com.pharmacie.repository.ProductRepository;
import org.bson.types.Binary;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
