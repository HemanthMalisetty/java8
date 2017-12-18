package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;



public class InterestClilent {
	public static void main(String[] args) {
//		Interest interest=new Interest();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount=scanner.nextDouble();
		System.out.println("Enter the years");
		int years=scanner.nextInt();
		System.out.println("Enter the rate");
		float rate=scanner.nextFloat();
		
		try {
			Interest interest=new Interest(amount, years, rate);
			System.out.println("Simple Interest: "+ interest.simpleInterest());
			System.out.println("Compound Interest: "+ interest.compoundInterest());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		System.out.println("Simple Interest: "+ SapUtil.roundUpTo2Decimal(interest.simpleInterest()));
//		System.out.println("Compound Interest: "+ SapUtil.roundUpTo2Decimal(interest.compoundInterest()));
		
		scanner.close();
	}
}
