package com.lsp.with;

public class PayPalPayment implements IOnlinePayment{
    @Override
    public Boolean authenticate() {
        System.out.println("Authenticating PayPal payment...");
        // credit card authenication logic
        // ...
        return true;
    }

    @Override
    public void processPayment(double amount) {
        authenticate();
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
