package com.example.thinagaran.fileToPojo;

public class User {

	private String userName;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password) {
		super();
		this.userName = username;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
}
