package com.book.servlets.Model;

public class DetailsModel {
	
	private String username;
	private String password;
	public  DetailsModel()
	{
		
	}
	public DetailsModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DetailsModel [username=" + username + ", password=" + password + "]";
	}
	

}
