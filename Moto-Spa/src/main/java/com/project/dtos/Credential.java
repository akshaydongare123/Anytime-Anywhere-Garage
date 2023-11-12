package com.project.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Credential {
	@Email // (message = "invalid email.")
	@NotBlank
	private String email;
	@Size(min = 3)
	@NotBlank
	private String password;
	

	public Credential() {
	}



	public Credential(String email, String password) {
		this.email = email;
		this.password = password;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Credentials [email=" + email + ", password=" + password +  "]";
	}
}
