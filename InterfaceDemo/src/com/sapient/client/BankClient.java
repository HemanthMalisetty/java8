package com.sapient.client;

import com.sapient.services.Atm;
import com.sapient.services.Bank;

public class BankClient {

	public static void main(String[] args) {
		Atm atm=Bank.getAtm();
		atm.deposite();
		atm.getBalance();
		atm.withdraw();
		
		

	}

}
