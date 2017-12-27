package com.sapient.vo;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private Double salary;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee employee) {
		Integer e1=this.eid;
		Integer e2=employee.eid;
		
		return e1.compareTo(e2);
	}
	
}
