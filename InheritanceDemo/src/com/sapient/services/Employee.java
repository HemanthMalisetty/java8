package com.sapient.services;

public class Employee implements Cloneable{
	private int employeeId;
	private String employeeName;
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return employeeId + " " + employeeName;
	}
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", toString()="
//				+ super.toString() + "]";
//	}
	@Override
	public boolean equals(Object obj) {
		Employee  employee=(Employee)obj;
		if(this == employee)
			return true;
		else if(this.employeeId == employee.employeeId && this.employeeName== employee.employeeName)
			return true;
		return false;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("The object is GC for employee ID: "+ employeeId);
		
	}
	@Override
	public Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee)super.clone();
	}
	
	
}
