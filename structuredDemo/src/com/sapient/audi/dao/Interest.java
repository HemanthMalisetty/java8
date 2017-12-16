/**
 * 
 */
package com.sapient.audi.dao;

import java.util.Scanner;

/**
 * @author rku200
 *
 */
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount=scanner.nextDouble();
		System.out.println("Enter the years");
		int year=scanner.nextInt();
		System.out.println("Enter the rate");
		float rate=scanner.nextFloat();
		
		System.out.println("Simple Interest: "+ simpleInerest(amount, year, rate));
		System.out.println("Compound Interest: "+ compoundInerest(amount, year, rate));
		

	}
	public static double simpleInerest(double amount,int year,float rate){
		double si=amount*year*rate/100;
		return si;
	}
	public static double compoundInerest(double amount,int year,float rate){
		double ci=amount*Math.pow(1+rate/100, year);
		return ci;
	}
}
