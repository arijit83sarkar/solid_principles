package com.ocp.badexample;

import com.ocp.common.EDiscountType;

public class OcpBadExampleMain {
    public static void main(String[] args) {
        Double purchasedAmount = 4710.78;

        FlatDiscount flatDiscount = new FlatDiscount()
                .setFlatDiscountAmount(250.00)
                .setBaseDiscountPercentage(1D);
        System.out.println("Actual purchased amount: " + purchasedAmount);
        System.out.println("After flat discount: " + flatDiscount.calculateDiscount(purchasedAmount));

        System.out.println("-------------------------------------");

        purchasedAmount = 6780.98;
        PercentageDiscount percentageDiscount = new PercentageDiscount()
                .setDiscountPercentage(1.3D)
                .setBaseDiscountPercentage(6.4D);
        System.out.println("Total purchase amount: " + purchasedAmount);
        System.out.println("After percentage discount: " + percentageDiscount.calculateDiscount(purchasedAmount));

        System.out.println("-------------------------------------");

        purchasedAmount = 5980.98;
        DiscountSystem discountSystem = new DiscountSystem()
                .setFlatDiscountAmount(320.60)
                .setBaseDiscountPercentage(0D);
        System.out.println("Actual purchased amount: " + purchasedAmount);
        System.out.println(
                "After flat discount: " + discountSystem.calculateDiscount(EDiscountType.FLAT, purchasedAmount));

        System.out.println("-------------------------------------");

        purchasedAmount = 7980.98;
        discountSystem = new DiscountSystem()
                .setDiscountPercentage(3.60)
                .setBaseDiscountPercentage(1.4);
        System.out.println("Actual purchased amount: " + purchasedAmount);
        System.out.println(
                "After percentage discount: "
                        + discountSystem.calculateDiscount(EDiscountType.PERCENTAGE, purchasedAmount));
    }
}
