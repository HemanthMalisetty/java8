package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Interest,Factorial{

	private static Calculator cal=new Calculator();
	
	private Calculator(){
		
	}
	
	
	public static Basic getBasic(){
		Basic obj=cal;
		return cal;
	}
	
	public static Interest getInterest(){
		Interest obj=cal;
		return cal;
	}
	
	public static Factorial getFactorial(){
		Factorial obj=cal;
		return cal;
	}
	
	@Override
	public String convert2Binary(int num) {
		
		return Integer.toBinaryString(num);
	}

	@Override
	public double calSimpleInterest(double amt, int years, float rate) {
		
		return amt * years * rate/100;
	}

	@Override
	public double calCompoundInterest(double amt, int years, float rate) {
		
		return amt* Math.pow(1 + rate/100, years)-amt;
	}

	@Override
	public BigInteger findFactorial(int num) {
		BigInteger fact=BigInteger.ONE;
		while(num>=1){
			fact=fact.multiply(BigInteger.valueOf(num));
			num--;
		}
		return fact;
	}


	@Override
	public int doSum(int... a) {
		
		return Interest.super.doSum(a);
	}
	
	
	
}
