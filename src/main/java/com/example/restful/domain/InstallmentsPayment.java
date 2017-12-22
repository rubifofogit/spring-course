package com.example.restful.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.example.restful.domain.enums.PaymentStatus;

@Entity
public class InstallmentsPayment extends Payment implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2889531905394786923L;
	
	private Integer numberOfInstallments;
	
	public InstallmentsPayment(){
		
	}
	
	public InstallmentsPayment(Integer id, PaymentStatus status, Order order,Integer numberOfInstallments) {
		super(id,status,order);
		this.numberOfInstallments = numberOfInstallments;
	}

	public InstallmentsPayment(Integer numberOfInstallments) {
		super();
		this.numberOfInstallments = numberOfInstallments;
	}

	public Integer getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(Integer numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}
	
	

}
