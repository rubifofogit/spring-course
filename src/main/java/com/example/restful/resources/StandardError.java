package com.example.restful.resources;

import java.io.Serializable;

public class StandardError implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8125283059153131160L;
	
	private Integer code;
	private String message;
	
	public StandardError() {
		super();
	}
	
	public StandardError(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
