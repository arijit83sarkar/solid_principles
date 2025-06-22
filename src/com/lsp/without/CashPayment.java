package com.lsp.without;

public class CashPayment extends Payment {
    @Override
    void processPayment(double amount) {
        // Cash payment do not require processing.
        throw new UnsupportedOperationException("Cash payment do not require processing.");
    }
}
