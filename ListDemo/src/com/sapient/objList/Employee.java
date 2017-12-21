package com.sapient.objList;

public class Employee implements Comparable<Employee> {
	
	private int eid;
	private String ename;
	private double sal;
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

		
	public Employee() {
		System.out.println("I am in contructor");
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}


	@Override
	public int compareTo(Employee emp) {
		Integer e1=this.eid;
		Integer e2=emp.eid;
		
		return e1.compareTo(e2);
	}


	public double getSal() {
		return sal;
	}


	public String getEname() {
		return ename;
	}

	
}
