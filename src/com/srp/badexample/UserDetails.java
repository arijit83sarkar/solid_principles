package com.srp.badexample;

public record UserDetails(Long id,
        String fullName,
        String email,
        String phone,
        String password) {
}
