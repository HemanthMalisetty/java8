package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Employee;

public class CountDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1005, "Radha", 56856));
		empList.add(new Employee(1004, "Madhav", 54687));
		empList.add(new Employee(1002, "Ramadheer", 23698));
		empList.add(new Employee(1009, "Faizal", 89654));
		empList.add(new Employee(1003, "Definite",12574));
		empList.add(new Employee(1001, "Sardar", 53687));
		
		Long size=empList.stream().filter(e-> e.getSalary()>=25000).count();
		System.out.println("Number of employee whose salary is >=25000: "+size);
	}

}
