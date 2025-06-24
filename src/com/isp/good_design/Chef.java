package com.isp.good_design;

public class Chef implements ICook {

    @Override
    public void cookDish(String dishName) {
        System.out.println("Chef: Yes, I can cook the food.");
    }

    @Override
    public void manageKitchenInventory() {
        System.out.println("Chef: I can manage the kitchen inventory.");
    }

}