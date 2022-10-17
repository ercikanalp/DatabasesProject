package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderService {



    public List<Order> getOrders(){
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(new Ingredient(1,"Cheese", 2, true));
        ingredients.add(new Ingredient(1, "Pepperoni", 5, false));
        Pizza pizza = new Pizza(1, "Special", ingredients);
        Drink drink = new Drink(1, "Coke", 2);
        Dessert dessert = new Dessert(1, "Cheesecake", 5);
        Menu menu = new Menu(1, List.of(pizza), List.of(drink), List.of(dessert));
        Customer customer = new Customer(1, "Alp", "Bassin", "0638867942", "6211AL");
        Order order = new Order(1, customer, menu);

        return
                List.of(order);
    }
}
