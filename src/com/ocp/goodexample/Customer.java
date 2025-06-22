package com.ocp.goodexample;

import com.ocp.common.EMembershipType;

public class Customer {
    private EMembershipType membershipType;
    private String customerName;
    private String phoneNumber;
    private Double totalPurchaseAmount;

    public EMembershipType getMembershipType() {
        return membershipType;
    }

    public Customer setMembershipType(EMembershipType membershipType) {
        this.membershipType = membershipType;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Customer setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public Customer setTotalPurchaseAmount(Double totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
        return this;
    }
}
