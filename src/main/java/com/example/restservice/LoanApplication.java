package com.example.restservice;

public class LoanApplication {
	String user;
	int amount;
	
	public LoanApplication(String user, int amount) {
		super();
		this.user = user;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "LoanApplication [user=" + user + ", amount=" + amount + "]";
	}
}
