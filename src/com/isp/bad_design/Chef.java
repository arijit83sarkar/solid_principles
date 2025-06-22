package com.isp.bad_design;

public class Chef implements IRestaurantStaff {

    @Override
    public void cookDish(String dishName) {
        System.out.println("Chef is cooking: " + dishName);
    }

    @Override
    public void takeOrder(String customerName, String orderDetails) {
        // Chef doesn't take orders! This method is irrelevant.
        throw new UnsupportedOperationException("Chef does not take orders.");
    }

    @Override
    public void serveFood(String customerName, String foodItem) {
        // Chef doesn't serve food!
        throw new UnsupportedOperationException("Chef does not serve food.");
    }

    @Override
    public void washDishes(int numberOfDishes) {
        // Chef doesn't wash dishes!
        throw new UnsupportedOperationException("Chef does not wash dishes.");
    }

    @Override
    public void manageKitchenInventory() {
        System.out.println("Chef is managing kitchen inventory.");
    }

    @Override
    public void handlePayment(double amount) {
        // Chef doesn't handle payments!
        throw new UnsupportedOperationException("Chef does not handle payments.");
    }

    @Override
    public void cleanTable(int tableNumber) {
        // Chef doesn't clean tables!
        throw new UnsupportedOperationException("Chef does not clean tables.");
    }

}
