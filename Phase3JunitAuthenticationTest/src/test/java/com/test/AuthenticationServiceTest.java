package com.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.service.AuthenticationService;
class AuthenticationServiceTest {
	@Test
	@DisplayName("Check User Authentication")
	void testCheckAuthentication() {
		AuthenticationService as=new AuthenticationService();
		String result=as.checkAuthentication("sree@gmail.com", "123");
		assertEquals("success",result);
		//Giving Wrong Password
		String result1=as.checkAuthentication("sree@gmail.com", "1234");
		assertEquals("failure",result1);
		//Giving Erong email
		String result2=as.checkAuthentication("sreeja@gmail.com", "123");
		assertEquals("failure",result2);
		//Giving Incorrect mail and password
		String result3=as.checkAuthentication("sreeja@gmail.com", "1234");
		assertEquals("failure",result3);
	}
}
