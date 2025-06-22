package com.ocp.goodexample;

public class OcpGoodExampleMain {
    public static void main(String[] args) {
        Double purchasedAmount = 4710.78;

        FlatDiscountService flatDiscountService = new FlatDiscountService()
                .setFlatDiscountAmount(250.98);
        flatDiscountService.setBaseDiscountPercentage(1D);
        System.out.println("Actual purchased amount: " + purchasedAmount);
        System.out.println("After flat discount: " + flatDiscountService.calculateDiscount(purchasedAmount));

        System.out.println("-------------------------------------");

        purchasedAmount = 7980.98;
        PercentageDiscountService percentageDiscountService = new PercentageDiscountService()
                .setDiscountPercentage(3.6);
        percentageDiscountService.setBaseDiscountPercentage(1.7);
        System.out.println("Actual purchased amount: " + purchasedAmount);
        System.out
                .println("After percentage discount: " + percentageDiscountService.calculateDiscount(purchasedAmount));
    }
}
