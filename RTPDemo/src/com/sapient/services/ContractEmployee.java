package com.sapient.services;

public class ContractEmployee extends Employee{
	
	private int days;
	public ContractEmployee(int employeeId, String employeeName, float salary, int days) {
		super(employeeId, employeeName, salary);
		this.days=days;
		
	}

	

	@Override
	public float calculateSalary() {
		return days*getSalary();
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%30.2f%20.2f%20s\n",days,calculateSalary(),getClass().getSimpleName());
	}
	
}
