package com.lsp.without;

public class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        // PayPal payment processing logic
        // ...
        // ...
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
