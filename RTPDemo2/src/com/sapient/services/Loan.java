package com.sapient.services;

public class Loan extends Account{

	public Loan(int accId, String customerName, double balance) {
		super(accId, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String depodite(double amt) {
		String res="Inefficient Balnce";
		double bal=0;
		if(amt<=getBalance()){
			bal=getBalance()-amt;
			setBalance(bal);
			res="Deposited";
		}
		return res;
	}

}
