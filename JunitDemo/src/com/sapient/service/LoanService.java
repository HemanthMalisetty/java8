package com.sapient.service;

public class LoanService {
	public String approveLoan(int age,double income)throws AgeException,IncomeException{
		if(age<20 || income >400000)
			 throw new AgeException("Age Exception");
		 if( income<400000)
			throw new IncomeException("Income Exeption");
		
		return "approved";
	}
}
