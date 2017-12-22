package com.example.restful.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.example.restful.domain.enums.PaymentStatus;

@Entity
public class CreditCardPayment extends Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2842765357273745906L;
	
	private Date dueDate;
	private Date paymentDate;
	
	public CreditCardPayment() {

	}
	
	
	public CreditCardPayment(Integer id, PaymentStatus status, Order order, Date dueDate, Date paymentDate) {
		super(id,status,order);
		this.dueDate = dueDate;
		this.paymentDate = paymentDate;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
}
