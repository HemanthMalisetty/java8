package com.sapient.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		String str1="67";
		String str2="4.5";
		
		int val1=Integer.parseInt(str1);
		double val2=Double.parseDouble(str2);
		
		System.out.println(val1 * val2);
		
		//Find size and range of primitive float
		System.out.println("Size of float: "+ Float.SIZE);
		System.out.println("Min: "+ Float.MIN_VALUE);
		System.out.println("Max: "+ Float.MAX_VALUE);
	}

}
