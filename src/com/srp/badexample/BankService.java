package com.srp.badexample;

public class BankService {
    public void deposite(String accountNumber, long amount) {
        System.out.println("Money deposited : " + amount);
    }

    public long withdraw(String accountNumber, long amount) {
        System.out.println("Money withdrwan : " + amount);
        return amount;
    }

    public void printPassbook(String accountNumber) {
        System.out.println("passbook printed....");
    }

    public void sendNotification(String accountNumber, String medium) {
        if (medium == "email") {
            System.out.println("Email send.......");
        }
        if (medium == "phone") {
            System.out.println("OTP send ........");
        }
    }

    public void getLoanInfo(String loanType) {
        if (loanType == "homeloan") {
            System.out.println("Home loan info........");
        }
        if (loanType == "personalloan") {
            System.out.println("Personal loan info........");
        }
        if (loanType == "carload") {
            System.out.println("Car loan info........");
        }
    }
}
