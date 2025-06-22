package com.srp.goodexample;

import java.util.List;

import com.srp.badexample.UserDetails;

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
		OTPService otpService = new OTPService();
		otpService.sendOTP(phoneNumber);

		return "SUCCESS";
	}

	// SAVE AUDIT DETAILS - MAINTAIN A LOG FOR THE CHANGES OF USER DETAILS
	public String saveAudit(List<AuditDetails> auditDetails) {
		AuditService auditService = new AuditService();
		auditService.saveAuditDetails(auditDetails);

		System.out.println("Audit information of user details is saved successfully.");
		return "SUCCESS";
	}
}
