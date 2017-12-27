package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Employee;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1005, "Radha", 56856));
		empList.add(new Employee(1004, "Madhav", 54687));
		empList.add(new Employee(1002, "Ramadheer", 23698));
		empList.add(new Employee(1009, "Faizal", 89654));
		empList.add(new Employee(1003, "Definite", 12574));
		empList.add(new Employee(1001, "Sardar", 53687));

		double sum = empList.stream().map(e -> e.getSalary()).reduce(0.0, (a, b) -> a + b);
		System.out.println("Total salary: " + sum);

		double sumDouble = empList.stream().mapToDouble(e -> e.getSalary()).sum();
		System.out.println("Total salary: " + sumDouble);
	}

}
