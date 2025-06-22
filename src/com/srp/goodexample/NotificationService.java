package com.srp.goodexample;

public class NotificationService {
    public void sendNotification(String accountNumber, String medium) {
        if (medium == "email") {
            System.out.println("Email send.......");
        }
        if (medium == "phone") {
            System.out.println("OTP send ........");
        }
    }
}
