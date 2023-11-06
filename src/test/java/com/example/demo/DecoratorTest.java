package com.example.demo;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import com.example.flower.decorator.BasketDecorator;
import com.example.flower.decorator.PaperDecorator;
import com.example.flower.decorator.RibbonDecorator;
import com.example.flower.store.FlowerBucket;
import com.example.flower.store.Item;

public class DecoratorTest {
    @Test
    public void TestBasketDecorator() {
        Item itemToDecorate = new FlowerBucket();
        BasketDecorator basketDecorator = 
            new BasketDecorator(itemToDecorate);
        double someNum = 4.0;
        Assertions.assertEquals(someNum, basketDecorator.getPrice());
    }

    @Test
    public void TestRibbonDecorator() {
        Item itemToDecorate = new FlowerBucket();
        RibbonDecorator ribbonDecorator = 
            new RibbonDecorator(itemToDecorate);
        double someNum = 40.0;
        Assertions.assertEquals(someNum, ribbonDecorator.getPrice());
    }

    @Test
    public void TestPaperDecorator() {
        Item itemToDecorate = new FlowerBucket();
        PaperDecorator paperDecorator = 
            new PaperDecorator(itemToDecorate);
        double someNum = 13.0;
        Assertions.assertEquals(someNum, paperDecorator.getPrice());
    }
}
