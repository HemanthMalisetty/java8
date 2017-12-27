package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sapient.util.EmployeeUtil;
import com.sapient.vo.Employee;

public class MapDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1005, "Radha", 56856));
		empList.add(new Employee(1004, "Madhav", 54687));
		empList.add(new Employee(1002, "Ramadheer", 23698));
		empList.add(new Employee(1009, "Faizal", 89654));
		empList.add(new Employee(1003, "Definite", 12574));
		empList.add(new Employee(1001, "Sardar", 53687));
		
		Stream<Employee> s=empList.stream().map(e-> {e.setSalary(e.getSalary() + e.getSalary()* 0.1); return e;});
		s.forEach(EmployeeUtil::display);
		System.out.println("------------------------------------------------\n");
		empList.forEach(EmployeeUtil::display);
	}

}
