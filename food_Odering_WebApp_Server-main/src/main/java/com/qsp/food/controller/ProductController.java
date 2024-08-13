package com.qsp.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.food.dto.Product;
import com.qsp.food.service.ProductService;

@RestController
@CrossOrigin("https://food-odering-web-app-client.vercel.app/")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@DeleteMapping("/daleteProductById/{id}")
	public Product daleteProductById(@PathVariable int id) {
		return service.daleteProductById(id);
	}
	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@RequestBody Product product ,@PathVariable int id) {
		return service.updatePriduct(product,id);
	}
	
}
