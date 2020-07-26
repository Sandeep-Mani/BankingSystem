package com.sandeep.mani.transaction;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue
	private UUID id;
	private UUID accountNumber;
	private String transactionType;
	private double amount;
	private double totalBalance;
	private Timestamp timeOfTransaction;
	public Transaction() {
		super();
	}
	public Transaction(UUID id, UUID accountNumber, String transactionType, double amount, double totalBalance,
			Timestamp timeOfTransaction) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.transactionType = transactionType;
		this.amount = amount;
		this.totalBalance = totalBalance;
		this.timeOfTransaction = timeOfTransaction;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(UUID accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public Timestamp getTimeOfTransaction() {
		return timeOfTransaction;
	}
	public void setTimeOfTransaction(Timestamp timeOfTransaction) {
		this.timeOfTransaction = timeOfTransaction;
	}
}
