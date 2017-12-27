package com.pack4;

public class PeterThread extends Thread{
	private Account account;
	
	private int amount;
	
	public PeterThread(Account account,  int amount) {
		this.account = account;
		
		this.amount = amount;
	}
	
	
	@Override
	public void run() {
		account.deposit(amount);
		System.out.println(account.getBalance());
	}
}
