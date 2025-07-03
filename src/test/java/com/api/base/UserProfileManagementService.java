package com.api.base;

import com.api.models.request.ProfileUpdateRequest;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {
	
	
	private final String BASE_PATH="/api/users";

	
	// GET
	public Response getProfile(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH +"/profile");
	}
	
	
	// PUT
	public Response updateProfile(String token, ProfileUpdateRequest payload) {
		setAuthToken(token);
		return putRequest(payload, BASE_PATH +"/profile");
	}
	
}
