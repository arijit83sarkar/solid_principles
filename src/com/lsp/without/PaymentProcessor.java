package com.lsp.without;

public class PaymentProcessor {
    public static void processTransaction(Payment payment, double amount) {
        payment.processPayment(amount);
    }

    public static void main(String[] args) {
        Payment creditcardPayment = new CreditCardPayment();
        Payment paypalPayment = new PayPalPayment();
        Payment cashPayment = new CashPayment();

        processTransaction(creditcardPayment, 170.0); // Works fine
        processTransaction(paypalPayment, 97.0); // Works fine
        processTransaction(cashPayment, 110.0); // Throws exception
    }
}
