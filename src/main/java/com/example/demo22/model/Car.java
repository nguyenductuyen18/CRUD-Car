package com.example.demo22.model;

public class Car {
    private int id;
    private String name;
    private int price;
    private String manufactor;

    public Car(int id, String name, int price, String manufactor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufactor = manufactor;
    }

    public Car(String name, int price, String manufactor) {
        this.name = name;
        this.price = price;
        this.manufactor = manufactor;
    }

    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }
}
