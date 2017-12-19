package com.sapient.client;

import com.sapient.services.Employee;

public class EmployeeClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=new Employee(1001, "Manav");
		Employee employee2=new Employee(1002, "Savan");
		Employee employee3=new Employee(1001, "Manav");
		
		System.out.println(employee);
		System.out.println(employee.equals(employee2));
		System.out.println(employee.equals(employee3));
		
		Employee employee4=employee.clone();
		System.out.println(employee4);
		System.out.println(employee.equals(employee4));

		
		employee=null;
		System.gc();
	}

}
