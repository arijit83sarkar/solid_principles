package com.ocp.badexample;

public class PercentageDiscount {
    // private EMembershipType membershipType;
    // private String customerId;
    // private String customerName;
    // private String address;
    // private String phoneNumber;
    // private Double totalPurchaseAmount;
    private Double discountPercentage;
    private Double baseDiscountPercentage;

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public PercentageDiscount setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;
    }

    public Double getBaseDiscountPercentage() {
        return baseDiscountPercentage;
    }

    public PercentageDiscount setBaseDiscountPercentage(Double baseDiscountPercentage) {
        this.baseDiscountPercentage = baseDiscountPercentage;
        return this;
    }

    // CALCULATE DISCOUNT
    public Double calculateDiscount(Double amount) {
        return amount - (amount * baseDiscountPercentage / 100) - (amount * discountPercentage / 100);
    }
}
