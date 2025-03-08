package com.book.servlets.Model;

public class GetAllModel {
	private String username;
	private String password;
	private String fromloc;
	private String toloc;
	private String email;
	private String number;
	private String gender;
	private String seatno;
	private String name;
	private String date;
	public GetAllModel()
	{
		
	}
	public GetAllModel(String username, String password, String fromloc, String toloc, String email, String number,
			String gender, String seatno, String name, String date) {
		super();
		this.username = username;
		this.password = password;
		this.fromloc = fromloc;
		this.toloc = toloc;
		this.email = email;
		this.number = number;
		this.gender = gender;
		this.seatno = seatno;
		this.name = name;
		this.date = date;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "GetAllModel [username=" + username + ", password=" + password + ", fromloc=" + fromloc + ", toloc="
				+ toloc + ", email=" + email + ", number=" + number + ", gender=" + gender + ", seatno=" + seatno
				+ ", name=" + name + ", date=" + date + "]";
	}
	

}
