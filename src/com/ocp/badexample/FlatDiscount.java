package com.ocp.badexample;

public class FlatDiscount {
    // private EMembershipType membershipType;
    // private String customerId;
    // private String customerName;
    // private String address;
    // private String phoneNumber;
    // private Double totalPurchaseAmount;
    private Double flatDiscountAmount;
    private Double baseDiscountPercentage;

    public Double getFlatDiscountAmount() {
        return flatDiscountAmount;
    }

    public FlatDiscount setFlatDiscountAmount(Double flatDiscountAmount) {
        this.flatDiscountAmount = flatDiscountAmount;
        return this;
    }

    public Double getBaseDiscountPercentage() {
        return baseDiscountPercentage;
    }

    public FlatDiscount setBaseDiscountPercentage(Double baseDiscountPercentage) {
        this.baseDiscountPercentage = baseDiscountPercentage;
        return this;
    }

    // CALCULATE DISCOUNT
    public Double calculateDiscount(Double amount) {
        return amount - (amount * baseDiscountPercentage / 100) - flatDiscountAmount;
    }
}
