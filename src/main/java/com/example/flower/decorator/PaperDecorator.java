package com.example.flower.decorator;

import com.example.flower.store.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperDecorator extends Decorator {
    private Item item;

    @Override
    void getDescription() {
        System.out.println("Paper");
    }

    public double getPrice() {
        final int THIRTEEN = 13;
        return THIRTEEN + item.getPrice();
    }
    
}
