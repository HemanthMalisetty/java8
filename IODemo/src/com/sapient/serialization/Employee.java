package com.sapient.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	private int eid;
	private transient String ename;
	private double salary;
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
}
