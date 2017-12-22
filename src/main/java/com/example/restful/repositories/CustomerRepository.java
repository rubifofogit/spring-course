package com.example.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restful.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	public Customer findByEmail(String email);
	
}
