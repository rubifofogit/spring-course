package com.example.restful.resources;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.restful.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceErrorHandler {

	@ExceptionHandler(value=ObjectNotFoundException.class)
	public ResponseEntity<?> objectNotFoundException(ObjectNotFoundException ex,HttpServletRequest request) {
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(),ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
