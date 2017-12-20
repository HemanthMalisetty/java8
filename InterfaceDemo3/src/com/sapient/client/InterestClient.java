package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		Interest obj=Calculator.getInterest();
		System.out.println(obj.calSimpleInterest(5000, 3, 3.2f));
		System.out.println(obj.calCompoundInterest(100000, 2, 1.23f));
		System.out.println(obj.convert2Binary(10));
		System.out.println(obj.doSum(1,2,3,4,5));
		System.out.println(obj.doAverage(1,2,3,4,5));
	}

}
