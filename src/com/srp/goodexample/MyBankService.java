package com.srp.goodexample;

public class MyBankService {
    public void deposite(String accountNumber, long amount) {
        System.out.println("Money deposited : " + amount);
    }

    public long withdraw(String accountNumber, long amount) {
        System.out.println("Money withdrwan : " + amount);
        return amount;
    }
}
