package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Order Is Not Cancelled!")
public class OrderCancelled extends Exception
{
    private static final long serialVersionUID = 1L;

    public OrderCancelled(String errorMessage)
    {
        super(errorMessage);
    }
}
