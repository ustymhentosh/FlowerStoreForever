package com.example.flower.decorator;

import com.example.flower.store.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator extends Decorator {
    private Item item;

    @Override
    void getDescription() {
        System.out.println("Ribbon");
    }

    public double getPrice() {
        final int FORTY = 40;
        return FORTY + item.getPrice();
    }
    
}