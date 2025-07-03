package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	// import static io.restassured.RestAssured.*; static import used for it's improves the readability
	// we don't need to write classname.given(RestAssured.given)
	
	
	@Test(description = "verify the login api....")
	public void loginTest() {
		baseURI="http://64.227.160.186:8080";
	 RequestSpecification X =  given();
	 RequestSpecification Y= X.header("Content-Type", "application/json");
	 RequestSpecification Z= Y.body("{\"username\": \"gopimohan7321@gmail.com\", \"password\": \"gopi1234\"}");
    Response response= Z.post("/api/auth/login");
	 System.out.println(response.asPrettyString());
	 Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}

}
