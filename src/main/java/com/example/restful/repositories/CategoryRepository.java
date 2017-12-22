package com.example.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restful.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	
	
}
