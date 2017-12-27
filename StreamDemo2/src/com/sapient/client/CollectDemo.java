package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sapient.util.EmployeeUtil;
import com.sapient.vo.Employee;

public class CollectDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1005, "Radha", 56856));
		empList.add(new Employee(1004, "Madhav", 54687));
		empList.add(new Employee(1002, "Ramadheer", 23698));
		empList.add(new Employee(1009, "Faizal", 89654));
		empList.add(new Employee(1003, "Definite",12574));
		empList.add(new Employee(1001, "Sardar", 53687));
		
		
		System.out.println("employee greater than and equal salary of 25000");
//		empList.stream().filter(e-> e.getSalary()>=25000).sorted().forEach(EmployeeUtil::display);
		List<Employee> list2=empList.stream().filter(e-> e.getSalary()>=25000).sorted().collect(Collectors.toList());
		list2.stream().forEach(EmployeeUtil::display);

	}

}
