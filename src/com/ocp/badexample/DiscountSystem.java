package com.ocp.badexample;

import com.ocp.common.EDiscountType;

public class DiscountSystem {
    private Double flatDiscountAmount;
    private Double discountPercentage;
    private Double baseDiscountPercentage;

    // CALCULATE DISCOUNT
    public Double calculateDiscount(EDiscountType type, Double amount) {
        Double discountedAmount;

        switch (type.name()) {
            case "FLAT":
                discountedAmount = amount - (amount * baseDiscountPercentage / 100) - flatDiscountAmount;
                break;
            case "PERCENTAGE":
                discountedAmount = amount - (amount * baseDiscountPercentage / 100)
                        - (amount * discountPercentage / 100);
                break;
            default:
                discountedAmount = 0D;
                break;
        }
        return discountedAmount;
    }

    public Double getFlatDiscountAmount() {
        return flatDiscountAmount;
    }

    public DiscountSystem setFlatDiscountAmount(Double flatDiscountAmount) {
        this.flatDiscountAmount = flatDiscountAmount;
        return this;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public DiscountSystem setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;
    }

    public Double getBaseDiscountPercentage() {
        return baseDiscountPercentage;
    }

    public DiscountSystem setBaseDiscountPercentage(Double baseDiscountPercentage) {
        this.baseDiscountPercentage = baseDiscountPercentage;
        return this;
    }
}
