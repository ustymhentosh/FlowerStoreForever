package com.example.flower.decorator;

import com.example.flower.store.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator extends Decorator {
    Item item;

    @Override
    void getDescription() {
        System.out.println("Ribbon");
    }

    public double getPrice() {
        return 40 + item.getPrice();
    }
    
}