package com.sapient.vo;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double salary;
	private int deptId;
	private LocalDate date;
	public Employee(int empId, String empName, double salary, int deptId, LocalDate date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptId = deptId;
		this.date = date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getDeptId() {
		return deptId;
	}
	public LocalDate getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", deptId=" + deptId
				+ ", date=" + date + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		Integer e1=this.empId;
		Integer e2=emp.empId;
		return e1.compareTo(e2);
	}
	
	
}
