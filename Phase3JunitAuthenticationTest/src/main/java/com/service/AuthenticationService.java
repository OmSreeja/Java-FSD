package com.service;
public class AuthenticationService {
	public String checkAuthentication(String emailId,String password) {
		if(emailId.equals("sree@gmail.com") && password.equals("123")) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}
