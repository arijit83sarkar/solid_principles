package com.ocp.goodexample;

public class FlatDiscountService extends Discount {
    private Double flatDiscountAmount;

    public Double getFlatDiscountAmount() {
        return flatDiscountAmount;
    }

    public FlatDiscountService setFlatDiscountAmount(Double discountAmount) {
        this.flatDiscountAmount = discountAmount;
        return this;
    }

    @Override
    public Double calculateDiscount(Double amount) {
        return amount - (amount * super.getBaseDiscountPercentage() / 100) - flatDiscountAmount;
    }
}
