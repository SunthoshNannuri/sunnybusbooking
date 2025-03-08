package com.book.servlets.Model;

public class AllInfoModel {
	private String username;
	private String password;
	private String fromloc;
	private String toloc;
	private String name;
	private String email;
	private String number;
	public AllInfoModel()
	{
		
	}
	public AllInfoModel(String username, String password, String fromloc, String toloc, String name, String email,
			String number) {
		super();
		this.username = username;
		this.password = password;
		this.fromloc = fromloc;
		this.toloc = toloc;
		this.name = name;
		this.email = email;
		this.number = number;
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
	public String getFromloc() {
		return fromloc;
	}
	public void setFromloc(String fromloc) {
		this.fromloc = fromloc;
	}
	public String getToloc() {
		return toloc;
	}
	public void setToloc(String toloc) {
		this.toloc = toloc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "AllInfoModel [username=" + username + ", password=" + password + ", fromloc=" + fromloc + ", toloc="
				+ toloc + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	

}
