package com.isp.bad_design;

public interface IRestaurantStaff {
    void cookDish(String dishName);

    void takeOrder(String customerName, String orderDetails);

    void serveFood(String customerName, String foodItem);

    void washDishes(int numberOfDishes);

    void manageKitchenInventory();

    void handlePayment(double amount);

    void cleanTable(int tableNumber);
}
