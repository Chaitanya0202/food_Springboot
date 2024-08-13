package com.qsp.food.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.food.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
