package com.pack4;


public class Account {
	public volatile int balance;  //it can be used only by only one thread at a time

	
	public Account(int balance) {
		this.balance = balance;
	}

	
	public int getBalance() {
		
		return balance;
	}

	
	private void setBalance(int balance) {
		
		this.balance = balance;
	}
	
	
	public synchronized  void deposit(String name, int amt) {
	
		for(int i=1; i<=500; ++i){
			System.out.println(name + " doing tx " );
		}
	}


	
}
