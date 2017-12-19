package com.sapient.services;

public class Saving extends Account {

	public Saving(int accId, String customerName, double balance) {
		super(accId, customerName, balance);
		}

	@Override
	public String depodite(double amt) {
		double bal=getBalance() + amt;
		String res="Not Deposited";
		if(amt < 50000){
			setBalance(bal);
			res="Deposited";
		}
		return res;
	}

}
