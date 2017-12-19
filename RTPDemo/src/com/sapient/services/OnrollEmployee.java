package com.sapient.services;

public class OnrollEmployee extends Employee{
	private float da;
	private float pf;
	public OnrollEmployee(int employeeId, String employeeName, float salary) {
		super(employeeId, employeeName, salary);
		// TODO Auto-generated constructor stub
	}
	public float getDa() {
		da= (float) (getSalary() * 0.4);
		return da;
	}
	public float getPf() {
		pf=(float) (getSalary() * 0.12);
		return pf;
	}
	@Override
	public float calculateSalary() {
		
		return getSalary() + da -pf;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10.2f%10.2f%30.2f\n",da,pf,calculateSalary(),getClass().getSimpleName());
	}
}
