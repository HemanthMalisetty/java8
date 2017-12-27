package com.pack4;


public class Account {
	public volatile int balance;

	
	public Account(int balance) {
		this.balance = balance;
	}

	
	public int getBalance() {
		
		return balance;
	}

	public  synchronized void deposit(int amt) {
	
		for(int i=1; i<=500; ++i){
			System.out.println(Thread.currentThread().getName() + " doing tx " );
		}
		balance = balance + amt;
	}


	
}
