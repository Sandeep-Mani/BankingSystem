package com.sandeep.mani.interest;

import java.util.UUID;

public class Interest {
	private UUID id;
	private float saving;
	private float loan;
	private float rd;
	private float fd;
	private float current;
	public Interest() {
		super();
	}
	public Interest(UUID id, float saving, float loan, float rd, float fd, float current) {
		super();
		this.id = id;
		this.saving = saving;
		this.loan = loan;
		this.rd = rd;
		this.fd = fd;
		this.current = current;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public float getSaving() {
		return saving;
	}
	public void setSaving(float saving) {
		this.saving = saving;
	}
	public float getLoan() {
		return loan;
	}
	public void setLoan(float loan) {
		this.loan = loan;
	}
	public float getRd() {
		return rd;
	}
	public void setRd(float rd) {
		this.rd = rd;
	}
	public float getFd() {
		return fd;
	}
	public void setFd(float fd) {
		this.fd = fd;
	}
	public float getCurrent() {
		return current;
	}
	public void setCurrent(float current) {
		this.current = current;
	}	
}
