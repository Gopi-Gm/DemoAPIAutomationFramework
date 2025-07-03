package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileUpdateRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileInfoTest {
	@Test(description = "verify the Get Profile API....")

	public void UpdateProfileInfoTest() {

		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("gopimohan7321@gmail.com", "gopi1234"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());

		System.out.println("........................................................");

		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "gopimohan7321@gmail.com");

		System.out.println("..................................................");

		ProfileUpdateRequest profileUpdateRequest = new ProfileUpdateRequest.Builder().firstName("Rashmitha")
				.lastName("Poojari").email("Rashmitha123@gmail.com").mobileNumber("9876543210").build();

		response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileUpdateRequest);
		System.out.println(response.asPrettyString());

	}

}
