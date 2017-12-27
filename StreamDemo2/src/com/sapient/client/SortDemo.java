package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.util.EmployeeUtil;
import com.sapient.vo.Employee;

public class SortDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1005, "Radha", 56856));
		empList.add(new Employee(1004, "Madhav", 54687));
		empList.add(new Employee(1002, "Ramadheer", 23698));
		empList.add(new Employee(1009, "Faizal", 89654));
		empList.add(new Employee(1003, "Definite",12574));
		empList.add(new Employee(1001, "Sardar", 53687));
		empList.add(null);
		
		System.out.println("Sort by employee id");
//		EmployeeUtil<>
//		empList.stream().sorted().forEach(System.out::println);
//		empList.stream().sorted().forEach(EmployeeUtil::display);
		System.out.println("Sorting by employee id");
		empList.stream().filter(e -> e!= null).sorted().forEach(EmployeeUtil::display);
		
		System.out.println("\nSorting by employee name");
		empList.stream().filter(e -> e!= null).
		sorted((e1,e2)-> e1.getEname().compareTo(e2.getEname())).
		forEach(EmployeeUtil::display);
		
		System.out.println("\nSorting by employee salary");
		empList.stream().filter(e -> e!= null).
		sorted((e1,e2)-> e1.getSalary().compareTo(e2.getSalary())).
		forEach(EmployeeUtil::display);
		
		

	}

}
