package com.sapient.audi.dao;

public class VarArgDemo {

	public static void main(String[] args) {
		System.out.println(sum(4,4,4,4));

	}
	
	public static int sum(int ...arr) {
		int sum=0;
		System.out.println("Var arg called");
		for (int i : arr) {
			sum+=i;
		}
		return sum;
	}

}
