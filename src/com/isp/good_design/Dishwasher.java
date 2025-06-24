package com.isp.good_design;

public class Dishwasher implements IDishwasher {

    @Override
    public void washDishes(int numberOfDishes) {
        System.out.println("Dishwasher: My job is to keep the table clean.");
    }

    @Override
    public void manageCleaningSupplies() {
        System.out.println("Dishwasher: I am managing the cleaning supplies.");
    }

}
