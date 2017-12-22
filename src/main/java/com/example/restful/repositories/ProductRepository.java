package com.example.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restful.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
