package com.api.tests;

import java.net.ResponseCache;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class ForgotPasswordTerst {
	
	
	@Test(description = "vedrify the forgotpassword api is working.......")
	
	
	public void AccountCreation() {
		
	AuthService authService= new AuthService();
	Response response= 	authService.forgotPassword("gopimohan7321@gmail.com");
	System.out.println(response.asPrettyString());
	
	}

}
