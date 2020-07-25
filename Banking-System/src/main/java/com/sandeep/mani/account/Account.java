package com.sandeep.mani.account;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sandeep.mani.customers.Customer;

@Entity
public class Account {
	@Id
	private String accNo;
	private String interestId;
	private BigInteger balance;
	private float interestRate;
	private Date openDate;
	private double interestAmount;
	private String accountType;
	
	@ManyToOne
	private Customer customer;
	
	public Account() {
		super();
	}
	
	public Account(String accNo, String interestId, BigInteger balance, float interestRate,
			Date openDate, double interestAmount, String accountType) {
		super();
		this.accNo = accNo;
		this.interestId = interestId;
		this.balance = balance;
		this.interestRate = interestRate;
		this.openDate = openDate;
		this.interestAmount = interestAmount;
		this.accountType = accountType;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getInterestId() {
		return interestId;
	}

	public void setInterestId(String interestId) {
		this.interestId = interestId;
	}

	public BigInteger getBalance() {
		return balance;
	}

	public void setBalance(BigInteger balance) {
		this.balance = balance;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
