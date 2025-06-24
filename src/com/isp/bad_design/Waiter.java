package com.isp.bad_design;

public class Waiter implements IRestaurantStaff {

    @Override
    public void cookDish(String dishName) {
        System.out.println("Waiter: I can not cook food!");
    }

    @Override
    public void takeOrder(String customerName, String orderDetails) {
        System.out.println("Waiter: Yes, I can take order from the customers.");
    }

    @Override
    public void serveFood(String customerName, String foodItem) {
        System.out.println("Waiter: Yes, I can serve food to the customers.");
    }

    @Override
    public void washDishes(int numberOfDishes) {
        System.out.println("Waiter: No, I am not going to wash the dishes!");
    }

    @Override
    public void manageKitchenInventory() {
        System.out.println("Waiter: No, I am not going to manage the kitchen inventory!");
    }

    @Override
    public void handlePayment(double amount) {
        System.out.println("Waiter: Yes, I can take payment from the customers.");
    }

    @Override
    public void cleanTable(int tableNumber) {
        System.out.println("Waiter: Yes, I will clean the tables.");
    }

}
