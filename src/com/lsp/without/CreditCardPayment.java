package com.lsp.without;

public class CreditCardPayment extends Payment {
    @Override
    void processPayment(double amount) {
        // Credit card payment processing logic
        // ...
        // ...
        System.out.println("Processing credit card payment of $" + amount);
    }
}
