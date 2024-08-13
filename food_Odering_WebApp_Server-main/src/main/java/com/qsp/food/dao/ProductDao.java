package com.qsp.food.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.food.dto.Product;
import com.qsp.food.repo.ProductRepo;
@Repository
public class ProductDao {
	
	@Autowired
	private ProductRepo productRepo;

	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product>optional=productRepo.findById(id);
		Product product=optional.get();
		return product;
	}

	public Product daleteProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product>optional=productRepo.findById(id);
		if (optional.isPresent()) {
			Product product=optional.get();
			
			productRepo.delete(product);
			return product;
		}
		return null;
	}

	public Product updateProduct(Product product,int id) {
		Optional<Product>optional=productRepo.findById(id);
		
		if(optional.isPresent()) {
			product.setId(id);
			
			productRepo.save(product);
			return product;
		}
		return null;
	}

}
