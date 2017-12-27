package com.pack5;


public class Account {
	private  int balance;

	
	public Account(int balance) {
		this.balance = balance;
	}

	
	public int getBalance() {
		
		return balance;
	}

	
	public   void deposit(int amt) {
	
		for(int i=1; i<=500; ++i){
			System.out.println(Thread.currentThread().getName() + " doing tx " );
		}
		balance = balance + amt;
	}


	
}
