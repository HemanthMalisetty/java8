package com.sapient.set;

import java.util.HashSet;
import java.util.Set;

import com.sapient.set.Employee;

public class SetDemo2 {

	public static void main(String[] args) {
		Employee emp1= new Employee(1001, "manav", 5464);
		Employee emp2= new Employee(1003, "tanav", 6456);
		Employee emp3= new Employee(1005, "savan", 56456);
		Employee emp4= new Employee(1006, "vavan", 34534);
		Employee emp5= new Employee(1003, "ravan", 34554);
		Employee emp6=emp5;
		
		
		Set<Employee> set=new HashSet<Employee>();
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		
		for (Employee employee : set) {
			System.out.println(employee);
		}

	}

}
