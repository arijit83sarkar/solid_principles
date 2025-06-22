package com.srp.goodexample;

public class OTPService {

	// SEND OTP TO USER PHONE NUMBER
	public String sendOTP(String phoneNumber) {
		// CONSUME THIRD PARTY API TO SEND OTP VIA SMS
		// ..

		System.out.println("OTP is successfully sent.");
		return "SUCCESS";
	}

	// OTP VALIDATION
	public String validateOTP(String code) {
		// CODE VALIDATION LOGIC
		// ..

		System.out.println("OTP validation is completed successfully.");
		return "SUCCESS";
	}
}
