package com.example.demo.exception;


 import org.springframework.http.HttpStatus;
 import org.springframework.web.bind.annotation.ResponseStatus;

 @ResponseStatus(value = HttpStatus.NOT_FOUND)
 public class PizzaNotFound extends RuntimeException{

 	private static final long serialVersionUID = 1L;
 	private String pizza;
 	private long id;
 	
 	public PizzaNotFound(String pizza, long id) {
 		super(String.format("%s with id %s not found", pizza, id));
 		this.pizza = pizza;
 		this.id = id;
 	}
 	
 	public String getPizzaName() {
 		return pizza;
 	}
 	public long getId() {
 		return id;
 	}
}
