package com.sapient.service;

public class Factory {

	public static CalcService getCalcservice(){
		CalcService ser=new CalcService();
		return ser;
	}
	
	public static Palindrome getPalindromeService(){
		Palindrome ser=new Palindrome();
		return ser;
	}
	
	public static EmployeeService getEmployeeService(){
		EmployeeService ser=new EmployeeService();
		return ser;
	}
	
	public static String[] getInput(){
		return new String[]{"amar","vikas","ravi","suresh","manish","shubham","rajendra",
				"keshav","rahul","janit","jaddu","harman","praveen","ganesh","afsal",
				"amarnath","saurabh","vasu","varun","sai"};
	}
}
