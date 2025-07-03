package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest3 {

	// import static io.restassured.RestAssured.*; static import used for it's improves the readability
	// we don't need to write classname.given(RestAssured.given)
	
	
	@Test(description = "verify the login api is working....")
	public void loginTest() {
		
		
		LoginRequest loginrequest = new  LoginRequest("gopimohan7321@gmail.com","gopi1234");

		AuthService authservice = new AuthService();
		
	Response response=	authservice.login(loginrequest);
	 LoginResponse loginResponse  =response.as(LoginResponse.class);
	
	System.out.println(response.asPrettyString());
	System.out.println(loginResponse.getToken());
	System.out.println(loginResponse.getId());
	System.out.println(loginResponse.getEmail());
	
	Assert.assertTrue(loginResponse.getToken() !=null);
	
	
	}

}
