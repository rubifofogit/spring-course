package com.example.restful.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restful.domain.Category;
import com.example.restful.exceptions.ObjectNotFoundException;
import com.example.restful.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> getCategories(){
		return repository.findAll();
	}

	public Category getCategory(Integer id) {
		Category category =  repository.findOne(id);
		if(category == null) {
			throw new ObjectNotFoundException("Category whith id " + id + " not found");
		}
		return category;
	}

}
