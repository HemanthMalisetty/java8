package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.Interest;
import com.sapient.util.SapUtil;

public class InterestClilent {
	public static void main(String[] args) {
		Interest interest=new Interest();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount=scanner.nextDouble();
		System.out.println("Enter the years");
		int year=scanner.nextInt();
		System.out.println("Enter the rate");
		float rate=scanner.nextFloat();
		interest.amount=amount;
		interest.years=year;
		interest.rate=rate;
		System.out.println("Simple Interest: "+ SapUtil.roundUpTo2Decimal(interest.simpleInterest()));
		System.out.println("Compound Interest: "+ SapUtil.roundUpTo2Decimal(interest.compoundInterest()));
		
		scanner.close();
	}
}
