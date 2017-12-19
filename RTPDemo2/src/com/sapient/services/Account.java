package com.sapient.services;

public abstract class Account {
	private int accId;
	private String customerName;
	private double balance;
	
	public void display(){
		System.out.println();
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", customerName=" + customerName + ", balance=" + balance + "]";
	}

	public Account(int accId, String customerName, double balance) {
		super();
		this.accId = accId;
		this.customerName = customerName;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract String depodite(double amt);
}
