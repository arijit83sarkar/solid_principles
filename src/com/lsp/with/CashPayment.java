package com.lsp.with;

public class CashPayment implements IPayment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Received cash payment of $" + amount);
    }

}
