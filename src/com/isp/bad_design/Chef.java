package com.isp.bad_design;

public class Chef implements IRestaurantStaff {

    @Override
    public void cookDish(String dishName) {
        System.out.println("Chef is cooking: " + dishName);
    }

    @Override
    public void takeOrder(String customerName, String orderDetails) {
        System.out.println("Chef does not take orders.");
    }

    @Override
    public void serveFood(String customerName, String foodItem) {
        System.out.println("Chef does not serve food!");
    }

    @Override
    public void washDishes(int numberOfDishes) {
        System.out.println("Chef does not wash dishes!");
    }

    @Override
    public void manageKitchenInventory() {
        System.out.println("Chef is managing kitchen inventory.");
    }

    @Override
    public void handlePayment(double amount) {
        System.out.println("Chef does not handle payments!");
    }

    @Override
    public void cleanTable(int tableNumber) {
        System.out.println("Chef does not clean tables!");
    }

}
