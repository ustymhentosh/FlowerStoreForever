package com.example.flower.decorator;

import com.example.flower.store.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperDecorator extends Decorator {
    Item item;

    @Override
    void getDescription() {
        System.out.println("Paper");
    }

    public double getPrice() {
        return 13 + item.getPrice();
    }
    
}
