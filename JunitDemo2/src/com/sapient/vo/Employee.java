package com.sapient.vo;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		return this.eid== employee.eid && this.ename.equals(employee.getEname()) && this.salary == employee.salary;
	}
	
	
}
