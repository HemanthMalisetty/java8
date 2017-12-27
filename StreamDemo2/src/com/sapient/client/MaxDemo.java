package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import com.sapient.util.EmployeeUtil;
import com.sapient.vo.Employee;

public class MaxDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1005, "Radha", 56856));
		empList.add(new Employee(1004, "Madhav", 54687));
		empList.add(new Employee(1002, "Ramadheer", 23698));
		empList.add(new Employee(1009, "Faizal", 89654));
		empList.add(new Employee(1003, "Definite", 12574));
		empList.add(new Employee(1001, "Sardar", 53687));
		empList.add(new Employee(1001, "Perpendicular", 89654));
		
		
		OptionalDouble opt=empList.stream().mapToDouble(e-> e.getSalary()).max();
		double max=opt.getAsDouble();
		
		empList.stream().filter(e-> e.getSalary() == max).forEach(EmployeeUtil::display);

	}

}
