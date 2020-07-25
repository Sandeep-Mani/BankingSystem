package com.sandeep.mani.customers;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private UUID customerId;
	private String customerPwd;
	private String name;
	private String address;
	private String email;
	private Date dob;
	private String gender;
	private String contact;

	public Customer() {
	}

	public Customer(String name, String address, String email, Date dob, String gender, String contact, UUID customerId,
			String customerPwd) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.customerId = customerId;
		this.customerPwd = customerPwd;
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

	public UUID getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPwd() {
		return customerPwd;
	}

	public void setCustomerPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
