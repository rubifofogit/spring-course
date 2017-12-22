package com.example.restful.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restful.domain.Customer;
import com.example.restful.services.CustomerService;

@RestController
@RequestMapping(value="/customers")
public class CustomerResource {

	@Autowired
	private CustomerService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getCategories(){
		List<Customer> customers = service.getCustomers();
		return ResponseEntity.ok().body(customers);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> getCategory(@PathVariable Integer id){
		Customer customer = service.getCustomer(id);
		return ResponseEntity.ok().body(customer);
	}
	
}
