package com.sapient.services;

public abstract class Employee {
	private int employeeId;
	private String employeeName;
	private float salary;
	public Employee(int employeeId, String employeeName, float salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void display(){
		System.out.printf("%10d%20s%10.2f",employeeId,employeeName,salary);
	}
	
	public abstract float calculateSalary();
}
