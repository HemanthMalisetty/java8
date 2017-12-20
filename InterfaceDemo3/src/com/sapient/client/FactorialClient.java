package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		Factorial factorial=Calculator.getFactorial();
		System.out.println(factorial.findFactorial(654));
		System.out.println(factorial.doSum(1,2,3,4,5));

	}

}
