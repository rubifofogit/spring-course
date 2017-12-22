package com.example.restful.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -699990289390194708L;

	public ObjectNotFoundException(String message) {
		super(message);
	}
	
	public ObjectNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}
}
