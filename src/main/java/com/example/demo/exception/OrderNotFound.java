package com.example.demo.exception;

 import org.springframework.http.HttpStatus;
 import org.springframework.web.bind.annotation.ResponseStatus;

 @ResponseStatus(value = HttpStatus.NOT_FOUND)
 public class OrderNotFound extends RuntimeException{

 	private static final long serialVersionUID = 1L;
 	private String order;
 	private long id;
 	
 	public OrderNotFound(String order, long id) {
 		super(String.format("%s with id %s not found", order, id));
 		this.order = order;
 		this.id = id;
 	}
 	
 	public String getOrderName() {
 		return order;
 	}
 	public long getId() {
 		return id;
 	}
	
}
