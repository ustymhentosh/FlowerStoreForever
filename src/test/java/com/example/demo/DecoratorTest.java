package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        BasketDecorator basketDecorator = new BasketDecorator(itemToDecorate);
        assertEquals(4.0, basketDecorator.getPrice()); // You can adjust the delta as needed
    }
    
    @Test
    public void TestRibbonDecorator() {
        Item itemToDecorate = new FlowerBucket();
        RibbonDecorator ribbonDecorator = new RibbonDecorator(itemToDecorate);
        assertEquals(40.0, ribbonDecorator.getPrice()); // You can adjust the delta as needed
    }

    @Test
    public void TestPaperDecorator() {
        Item itemToDecorate = new FlowerBucket();
        PaperDecorator paperDecorator = new PaperDecorator(itemToDecorate);
        assertEquals(13.0, paperDecorator.getPrice()); // You can adjust the delta as needed
    }
}
