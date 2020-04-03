package com.udemy.spring.data.SpringDataJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.spring.data.SpringDataJpa.entity.Product;
import com.udemy.spring.data.SpringDataJpa.repo.ProductRepo;

@RestController
//@Controller // for mvc
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepo repository;

	//	@RequestMapping(path = "/getProduct",method = RequestMethod.GET)
	@GetMapping
	//	@ResponseBody
	public Iterable<Product> getProducts(){
		return  repository.findAll();
		//		return "hello";

	}

	@PostMapping
	public Product create(@RequestBody Product product) {
		return repository.save(product);
	}


	@PutMapping
	public Product update(@RequestBody Product product) {
		return repository.save(product);
	}

	@GetMapping("/{id}")
	public Product update(@PathVariable("id") Long id) {
		return repository.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}
