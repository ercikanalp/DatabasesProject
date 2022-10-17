package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String customer;
	private long id;
	
	public CustomerNotFound(String customer, long id) {
		super(String.format("%s with id %s not found", customer, id));
		this.customer = customer;
		this.id = id;
	}
	
	public String getCustomerName() {
		return customer;
	}
	public long getId() {
		return id;
	}
}
