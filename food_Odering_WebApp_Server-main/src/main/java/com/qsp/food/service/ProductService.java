package com.qsp.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.food.dao.ProductDao;
import com.qsp.food.dto.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;

	
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.saveProduct(product);
	}


	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return dao.getProductById(id);
	}


	public Product daleteProductById(int id) {
		// TODO Auto-generated method stub
		return dao.daleteProductById(id);
	}


	public Product updatePriduct(Product product ,int id) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product,id);
	}

}
