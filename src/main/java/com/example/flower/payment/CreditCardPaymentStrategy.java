package com.example.flower.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Paid with CreditCard $" +  price);
    }
}
