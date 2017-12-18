package com.sapient.audi.dao;

import java.math.BigInteger;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factorial: "+ factorial(11111));

	}
	public static BigInteger factorial(long num) {
		BigInteger fact=BigInteger.ONE;
		
		while(num>=1){
			fact=fact.multiply(BigInteger.valueOf(num));
			num--;
		}
		return fact;
	}

}
