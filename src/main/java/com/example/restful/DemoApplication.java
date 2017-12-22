package com.example.restful;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.example.restful.domain.Category;
import com.example.restful.domain.Customer;
import com.example.restful.domain.Product;
import com.example.restful.domain.enums.CustomerType;
import com.example.restful.repositories.CategoryRepository;
import com.example.restful.repositories.CustomerRepository;
import com.example.restful.repositories.ProductRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class).headless(false).web(true).run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		configureHeadlessProperty();
		
		Customer customer = new Customer(null, "Adolfo Rubio", "rubifofo@gmail.com", "GILT012", CustomerType.NATURALPERSON);
		Customer customer2 = new Customer(null, "Laura Rubio", "laurarubioo@gmail.com", "GILT", CustomerType.NATURALPERSON);
		customerRepository.save(Arrays.asList(customer,customer2));
		Category category = new Category(null, "Informática");
		Category category2 = new Category(null, "Moda");
		
		Product product = new Product(null, "Ratón", 20.0);
		Product product2 = new Product(null, "Teclado", 80.0);
		
		
		
		category.getProducts().addAll(Arrays.asList(product,product2));
		product.getCategories().add(category);
		product2.getCategories().add(category);
		categoryRepository.save(Arrays.asList(category,category2));
		productRepository.save(Arrays.asList(product,product2));
		
	}
	
	private boolean headless = true;

	

	private void configureHeadlessProperty() {
	        System.setProperty("java.awt.headless", System.getProperty(
	        		"java.awt.headless", Boolean.toString(this.headless)));
	}
	
}
