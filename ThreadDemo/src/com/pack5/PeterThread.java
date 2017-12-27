package com.pack5;

public class PeterThread extends Thread{
	private Account account;
	
	private int amount;
	
	public PeterThread(Account account, int amount) {
		this.account = account;
		
		this.amount = amount;
	}
	
	
	@Override
	public void run() {
		synchronized(account){
			account.deposit( amount);
		}
	}
}
