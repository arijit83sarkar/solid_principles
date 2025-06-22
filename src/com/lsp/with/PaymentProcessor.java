package com.lsp.with;

public class PaymentProcessor {
    public static void processTransaction(IPayment payment, double amount) {
        payment.processPayment(amount);
    }

    public static void main(String[] args) {
        IPayment creditcardPayment = new CreditCardPayment();
        IPayment paypalPayment = new PayPalPayment();
        IPayment cashPayment = new CashPayment();

        processTransaction(creditcardPayment, 37.73);
        processTransaction(paypalPayment, 39.89);
        processTransaction(cashPayment, 67.37);
    }
}
