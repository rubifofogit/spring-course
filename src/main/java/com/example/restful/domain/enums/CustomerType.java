package com.example.restful.domain.enums;

public enum CustomerType {

	NATURALPERSON('F',"Fisica"),
	LEGALPERSON('J',"Juridica");
	
	private char code;
	private String description;
	
	private CustomerType(char code, String description) {
		this.code = code;
		this.description = description;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static CustomerType toEnum(char code) {
		if(code=='F')
			return NATURALPERSON;
		if(code=='J')
			return LEGALPERSON;
		throw new IllegalArgumentException();
	}
	
}
