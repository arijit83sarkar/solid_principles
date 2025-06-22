package com.srp.goodexample;

public class LoanService {
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
