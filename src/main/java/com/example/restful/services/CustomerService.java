package com.example.restful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restful.domain.Category;
import com.example.restful.domain.Customer;
import com.example.restful.exceptions.ObjectNotFoundException;
import com.example.restful.repositories.CategoryRepository;
import com.example.restful.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public List<Customer> getCustomers(){
		return repository.findAll();
	}

	public Customer getCustomer(Integer id) {
		Customer customer =  repository.findOne(id);
		if(customer == null) {
			throw new ObjectNotFoundException("Customer whith id " + id + " not found");
		}
		return customer;
	}
	
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}

}
