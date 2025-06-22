package com.srp.goodexample;

import com.srp.badexample.UserDetails;

public class UserDetailsUpdateService {

    // UPDATE USER DETAILS
    public String updateUserDetails(UserDetails details) {
        // LOGIC TO SAVE/UPDATE USER DETAILS IN DB
        // ...

        System.out.println("User details is updated successfully.");
        return "SUCCESS";
    }
}
