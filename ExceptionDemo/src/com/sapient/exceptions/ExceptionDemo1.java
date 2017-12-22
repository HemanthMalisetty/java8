package com.sapient.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Line 1");
		System.out.println("Line 2");
		
		try {
			int a=5/0;
			System.out.println("try block");
		} catch (ArithmeticException e) {
			
			e.getMessage();
			System.out.println("Catch block");
			e.printStackTrace();
			
		}
		finally {
			
		}
		System.out.println("Line 3");
		System.out.println("Line 4");
		System.out.println("Line 5");
		System.out.println("Line 6");
		System.out.println("Line 7");
		System.out.println("Line 8");
		

	}

}
