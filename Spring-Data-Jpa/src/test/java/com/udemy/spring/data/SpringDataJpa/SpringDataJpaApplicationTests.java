package com.udemy.spring.data.SpringDataJpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.udemy.spring.data.SpringDataJpa.entity.Product;
import com.udemy.spring.data.SpringDataJpa.repo.ProductRepo;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		ProductRepo repository = context.getBean(ProductRepo.class);
		Product product = new Product();
		product.setId(1l);
		product.setName("Mac");
		product.setDescription("Awesome");
		product.setPrice(1300);
//		repository.save(product );

//		Product result = repository.findById(1l).get();
//		System.out.println("product Details : " + result);

//		result.setPrice(1500);
//		repository.save(result);

//		repository.findAll().forEach(p->{ 
//			System.out.println("product id : " + p.getId());
//			System.out.println("product name : " + p.getName());
//			System.out.println("product decsription : " + p.getDescription());
//			System.out.println("product price : " + p.getPrice());
//		});
		
//		repository.deleteById(2l);
		
		System.out.println(repository.findByName("mac"));//custom method
		System.out.println(repository.findByPrice(1500));//custom method
		
		System.out.println(repository.findByNameAndPrice("test", 2000));

	}

}
