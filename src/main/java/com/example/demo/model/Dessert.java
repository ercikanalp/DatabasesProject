package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table
public class Dessert {
    @Id
    @SequenceGenerator(
            name = "dessert_sequence",
            sequenceName = "dessert_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dessert_sequence"
    )
	private long id;
   	private String name;
    private double price;

    public Dessert(){

    }

    public Dessert(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
