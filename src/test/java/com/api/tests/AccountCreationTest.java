package com.api.tests;

import java.net.ResponseCache;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	
	@Test(description = "vedrify the account creation.......")
	
	
	public void AccountCreation() {
		
		//SignUpRequest signUpRequest= new SignUpRequest(null, null, null, null, null, null);
		// we can use this way, but here payload is big, due to that we are using Builder class
		
		SignUpRequest signUpRequest= new SignUpRequest.Builder()
		.userName("rashmi12346")
		.email("rashmitha12345@gmail.com")
		.firstName("Rashmithaa")
		.lastName("poojarii")
		.password("rashmith71516")
		.mobileNumber("4444444445")
		.Build();
		
		
		AuthService authService = new AuthService();
	Response response=authService.signUp(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		Assert.assertEquals(response.statusCode(), 201);
	}

}
