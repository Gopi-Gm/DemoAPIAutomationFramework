package com.api.models.request;

public class ProfileUpdateRequest {

	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;

	// Constructor using fields
	public ProfileUpdateRequest(String firstName, String lastName, String email, String mobileNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "ProfileUpdateRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	// firstName getter and setter
	public String getFirstName() {
		return firstName;
	}

	public ProfileUpdateRequest setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	// lastName getter and setter
	public String getLastName() {
		return lastName;
	}

	public ProfileUpdateRequest setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	// email getter and setter
	public String getEmail() {
		return email;
	}

	public ProfileUpdateRequest setEmail(String email) {
		this.email = email;
		return this;
	}

	// mobileNumber getter and setter
	public String getMobileNumber() {
		return mobileNumber;
	}

	public ProfileUpdateRequest setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}

	// Builder Class
	public static class Builder {
		private String firstName;
		private String lastName;
		private String email;
		private String mobileNumber;

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public ProfileUpdateRequest build() {
			ProfileUpdateRequest profileUpdateRequest = new ProfileUpdateRequest(firstName, lastName, email,
					mobileNumber);
			return profileUpdateRequest;

		}

	}

}
