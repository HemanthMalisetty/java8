package com.sapient.vo;

public class Account {
	private int accId;
	private String custName;
	private double bal;
	public Account(int accId, String custName, double amt) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.bal = amt;
	}
	public int getAccId() {
		return accId;
	}
	public String getCustName() {
		return custName;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
}
