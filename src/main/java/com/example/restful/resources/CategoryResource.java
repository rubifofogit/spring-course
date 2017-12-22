package com.example.restful.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restful.domain.Category;
import com.example.restful.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getCategories(){
		List<Category> categories = service.getCategories();
		return ResponseEntity.ok().body(categories);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> getCategory(@PathVariable Integer id){
		Category category = service.getCategory(id);
		return ResponseEntity.ok().body(category);
	}
	
	
}
