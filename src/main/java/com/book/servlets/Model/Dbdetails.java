package com.book.servlets.Model;

public class Dbdetails {
	private String url;
	private String password;
	private String username;
	public Dbdetails()
	{
		
	}
	public Dbdetails(String url, String password, String username) {
		this.url = url;
		this.password = password;
		this.username = username;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Dbdetails [url=" + url + ", password=" + password + ", username=" + username + "]";
	}
	

}
