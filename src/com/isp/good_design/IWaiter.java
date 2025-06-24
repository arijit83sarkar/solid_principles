package com.isp.good_design;

public interface IWaiter {
    void takeOrder(String customerName, String orderDetails);

    void serveFood(String customerName, String foodItem);

    void handlePayment(double amount);

    void cleanTable(int tableNumber);
}
