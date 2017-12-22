package com.example.restful.domain.enums;

public enum PaymentStatus {

	PENDING('P',"Pendiente"),
	PAID('F',"Pagado"),
	CANCELLED('C',"Cancelado");
	
	
	private char code;
	private String description;
	
	private PaymentStatus(char code, String description) {
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
	
	public static PaymentStatus toEnum(char code) {
		if(code=='P')
			return PENDING;
		if(code=='F')
			return PAID;
		if(code=='C')
			return CANCELLED;
		throw new IllegalArgumentException();
	}
	
}
