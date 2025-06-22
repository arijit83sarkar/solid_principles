package com.ocp.goodexample;

public class PercentageDiscountService extends Discount {
    private Double discountPercentage;

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public PercentageDiscountService setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;
    }

    @Override
    public Double calculateDiscount(Double amount) {
        return amount - (amount * super.getBaseDiscountPercentage() / 100) - (amount * discountPercentage / 100);
    }
}
