package com.srp.goodexample;

import java.time.LocalDateTime;
import java.util.List;

import com.srp.badexample.UserDetails;

public class SingleResponsibilityMain {
    public static void main(String[] args) {

        // REGISTRATION SERVICE
        UserRegistrationService registrationService = new UserRegistrationService();
        registrationService.register(new UserDetails(0L,
                "Silas Ross",
                "silas_ross@gmail.com",
                "9090801010",
                "silas8090ross"));

        // UPDATE SERVICE
        UserDetailsUpdateService updateService = new UserDetailsUpdateService();
        updateService.updateUserDetails(new UserDetails(101L,
                "Silas Ross",
                "silas_6060_ross@gmail.com",
                "9090806060",
                "silas8090ross"));

        // LOG/AUDIT SERVICE
        AuditService auditService = new AuditService();
        auditService.saveAuditDetails(List.of(new AuditDetails(LocalDateTime.now(),
                "email",
                "silas_ross@gmail.com",
                "silas_6060_ross@gmail.com",
                "user",
                109L),
                new AuditDetails(LocalDateTime.now(),
                        "phone",
                        "9090801010",
                        "9090806060",
                        "user",
                        109L)));

        // OTP SERVICE
        OTPService otpService = new OTPService();
        otpService.sendOTP("9000000010");
        otpService.validateOTP("983417");
    }
}
