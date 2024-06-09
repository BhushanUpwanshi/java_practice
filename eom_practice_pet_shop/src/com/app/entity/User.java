package com.app.entity;

public class User {
	private String email;
	private String Password;
	private UStatus status;
	public User(String email, String password, UStatus status) {
		super();
		this.email = email;
		Password = password;
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public UStatus getStatus() {
		return status;
	}
	public void setStatus(UStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", Password=" + Password + ", status=" + status + "]";
	}
	
	
}
