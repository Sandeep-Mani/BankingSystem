package com.sandeep.mani.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "customer")
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String customerId;
	private String customerPwd;
	private String name;
	private String address;
	private String email;
	private Date dob;
	private String gender;
	private String contact;

	public Customer() {
		this.customerId = UUID.randomUUID().toString();
	}

//	public Customer(String name, String address, String email, Date dob, String gender, String contact, String customerId,
//			String customerPwd) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.email = email;
//		this.dob = dob;
//		this.gender = gender;
//		this.contact = contact;
//		this.customerId = UUID.randomUUID().toString();
//		this.customerPwd = customerPwd;
//	}

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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
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
