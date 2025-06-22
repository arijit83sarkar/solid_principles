package com.srp.badexample;

public class UserService {

	// REGISTER A NEW USER
	public String register(UserDetails registerDetails) {
		System.out.println("User registration is completed successfully.");
		return "SUCCESS";
	}

	// UPDATE USER DETAILS
	public String updateUserDetails(UserDetails details) {
		System.out.println("User details is updated successfully.");
		return "SUCCESS";
	}

	// LOGIN USING USERNAME AND PASSWORD
	public String login(String userName, String password) {
		System.out.println("User credential is verified successfully.");
		return "SUCCESS";
	}

	// SEND OTP TO USER PHONE NUMBER
	public String sendOTP(String phoneNumber) {
		// CONSUME THIRD PARTY API TO SEND OTP VIA SMS
		// ..

		System.out.println("OTP is successfully sent.");
		return "SUCCESS";
	}

	// OTP VALIDATION
	public String validateOTP(String code) {
		// OTP/CODE VALIDATION LOGIC
		// ..

		System.out.println("OTP validation is completed successfully.");
		return "SUCCESS";
	}

	// SSO: TOKEN VALIDATION
	public String validateOAuthToken(String token) {
		// CONSUME THIRD PARTY API TO VALIDATE OAUTH TOKEN
		// ..

		System.out.println("OAurh Token validation is completed successfully.");
		return "SUCCESS";
	}

	// SAVE AUDIT DETAILS - MAINTAIN A LOG FOR THE CHANGES OF USER DETAILS
	public String saveAudit(UserDetails details) {
		System.out.println("Audit information of user details is saved successfully.");
		return "SUCCESS";
	}
}
