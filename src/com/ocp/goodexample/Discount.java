package com.ocp.goodexample;

public abstract class Discount {
    private Double baseDiscountPercentage;

    public abstract Double calculateDiscount(Double amount);

    public Double getBaseDiscountPercentage() {
        return baseDiscountPercentage;
    }

    public void setBaseDiscountPercentage(Double discountPercentage) {
        this.baseDiscountPercentage = discountPercentage;
    }
}
