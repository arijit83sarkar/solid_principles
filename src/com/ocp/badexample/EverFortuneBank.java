package com.ocp.badexample;

import com.ocp.common.CustomerDueHistory;

public class EverFortuneBank {
    private String customerId;
    private String address;
    private String phoneNumber;
    private Double interestRate;

    public Double getTotalDuePayment() {
        Double dueAmount = CustomerDueHistory.getDueAmount("C9000991");
        return 0D;
    }
}
