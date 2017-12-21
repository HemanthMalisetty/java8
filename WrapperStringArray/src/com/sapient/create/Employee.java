package com.sapient.create;

public class Employee {
	
	static{
		System.out.println("I am in static block");
	}
	
	public Employee() {
		System.out.println("I am in contructor");
	}

	public void display(){
		System.out.println("instance method display");
	}
}
