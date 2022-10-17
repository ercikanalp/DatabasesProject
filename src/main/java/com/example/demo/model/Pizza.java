package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Pizza {
    @Id
    @SequenceGenerator(
            name = "pizza_sequence",
            sequenceName = "pizza_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pizza_sequence"
    )
    private long id;
    private String name;
    private boolean vegetarian;
    private double price;
    @OneToMany
    private List<Ingredient> ingredients;


    public Pizza(long id, String name, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        price = calculatePrice();
        vegetarian = false;
    }

    public Pizza() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private boolean checkVegetarian(){
        for(Ingredient ingredient : ingredients){
            if(ingredient.isVegetarian()){
                vegetarian = true;
            }
        }
        return vegetarian;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    private double calculatePrice(){
        for(Ingredient ingredient : ingredients){
            price += ingredient.getPrice();
        }
        price *= 1.4;
        return price;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


}

