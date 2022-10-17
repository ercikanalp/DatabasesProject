package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Ingredient {
    @Id
    @SequenceGenerator(
            name = "ingredient_sequence",
            sequenceName = "ingredient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ingredient_sequence"
    )
    private long id;
    private double price;
    private String name;
    private boolean vegetarian;

    public Ingredient(long id, String name, double price, boolean vegetarian) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.vegetarian = vegetarian;
    }

    public Ingredient(){

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
