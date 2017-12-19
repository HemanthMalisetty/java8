package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.Account;
import com.sapient.services.Loan;
import com.sapient.services.Saving;

public class AccountClient {

	private static Account[] arr=new Account[2];
	
	static{
		arr[0]=new Saving(1001, "Sonal", 5000);
		arr[1]=new Loan(1002, "Bharat", 25000);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String choice=null;
		int acctype=0;
		double amt=0;
		do{
			System.out.println("Enter  0 for saving and 1 for loan");
			acctype=scanner.nextInt();
			if(acctype < 0 ||acctype >1){
				System.out.println("Invalid account type");
			}
			else{
		
				
			System.out.println("Enter amount to be deposit");
			amt=scanner.nextDouble();
			arr[acctype].depodite(amt);
			System.out.println(arr[acctype]);
//			arr[acctype].display();
			}
			System.out.println("press y to continue");
			choice=scanner.next();
			
					
		}while(choice.equals('y') || choice.equals('Y'));
		

	}

}
