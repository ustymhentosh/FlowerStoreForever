package com.example.flower.decorator;

import com.example.flower.store.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends Decorator {
    private Item item;

    @Override
    void getDescription() {
        System.out.println("Basket");
    }

    public double getPrice() {
        final int HUNDRED = 4;
        return HUNDRED + item.getPrice();
    }
    
}