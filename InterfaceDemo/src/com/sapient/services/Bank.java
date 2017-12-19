package com.sapient.services;

public class Bank implements Atm,Agent{

	
	
	
	
	private static Bank bank=new Bank();
	private  Bank() {
		
	}
	
	public static Atm getAtm(){
		Atm atm=bank;
		return atm;
	}
	
	public static Agent getAgent(){
		Agent agent=bank;
		return agent;
	}
	
	@Override
	public void clearPd() {
		System.out.println("Clear pdc");
	}

	@Override
	public void approveLoan() {
		System.out.println("Approve Loan");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
		
	}

	@Override
	public void deposite() {
		System.out.println("deposited");
		
	}

	@Override
	public void getBalance() {
		System.out.println("Get balance");
		
	}

}
