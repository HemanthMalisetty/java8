package com.sapient.exceptions;

public class Demo2 {

	public static void main(String[] args) {
		String res=approveLoan(13, 300000);
		System.out.println(res);
		
	}
	
	
	public static String approveLoan(int age,double income) {
		String res=null;
		try {
			res=processLoan(age, income);
			return res;
		} catch (EncomeException | AgeException  e) {
			return e.getMessage();
			
		}
		finally {
			System.out.println("finally block called");
		}
		
	}
	public static  String processLoan(int age,double income) throws AgeException, EncomeException {
		if(age<20 || age >40)
			throw new AgeException("Age must be between 20 & 40");
		if(income <400000 )
			throw new EncomeException("Encome must be minimum 4 lakhs");
		return "Loan Approved";
	}

}
