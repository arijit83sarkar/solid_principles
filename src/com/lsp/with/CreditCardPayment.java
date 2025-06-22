package com.lsp.with;

public class CreditCardPayment implements IOnlinePayment {
    @Override
    public Boolean authenticate() {
        System.out.println("Authenticating credit card payment...");
        // credit card authenication logic
        // ...
        return true;
    }

    @Override
    public void processPayment(double amount) {
        authenticate();
        System.out.println("Processing credit card payment of $" + amount);
    }
}
