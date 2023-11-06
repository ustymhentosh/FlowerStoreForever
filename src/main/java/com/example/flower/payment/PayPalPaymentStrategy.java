package com.example.flower.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Paid with PayPal $" +  price);
    }
}
