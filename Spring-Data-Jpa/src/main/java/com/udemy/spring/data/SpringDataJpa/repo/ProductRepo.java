package com.udemy.spring.data.SpringDataJpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.udemy.spring.data.SpringDataJpa.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{

	List<Product> findByName(String name);
	List<Product> findByPrice(double price);

	Product findByNameAndPrice(String name, double price);

}
