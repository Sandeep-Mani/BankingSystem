package com.sandeep.mani.users;

import java.util.Date;

public abstract class User {
	private String name;
	private String address;
	private String email;
	private Date dob;
	private String gender;
	private String contact;
	private String userId;
	private String userPwd;
	public User() {	}
	
	public User(String name, String address, String email, Date dob, String gender, String contact, String userId,
			String userPwd) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.userId = userId;
		this.userPwd = userPwd;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	
}
