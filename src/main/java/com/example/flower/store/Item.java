package com.example.flower.store;

public abstract class Item {
    private String description;

    public abstract double getPrice();

    public String getDescription(){
        return description;
    }
}
