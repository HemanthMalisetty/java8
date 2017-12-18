package com.sapient.audi.dao;

public class CommandLineDemo {

	public static void main(String[] args) {
		int val1= Integer.parseInt(args[0]);
		int val2= Integer.parseInt(args[1]);
		int result=val1+val2;
		System.out.println("result: "+ result );

	}

}
