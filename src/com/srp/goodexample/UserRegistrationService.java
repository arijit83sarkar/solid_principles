package com.srp.goodexample;

import com.srp.badexample.UserDetails;

public class UserRegistrationService {

    // REGISTER A NEW USER
    public String register(UserDetails registerDetails) {
        // LOGIC TO SAVE USER DETAILS IN DB
        // ...

        System.out.println("User registration is completed successfully.");
        return "SUCCESS";
    }
}
