package com.example.flower.decorator;

import com.example.flower.store.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends Decorator {
    Item item;

    @Override
    void getDescription() {
        System.out.println("Basket");
    }

    public double getPrice(){
        return 4 + item.getPrice();
    }
    
}