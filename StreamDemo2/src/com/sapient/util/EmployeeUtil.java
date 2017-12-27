package com.sapient.util;

import com.sapient.vo.Employee;

public class EmployeeUtil {

	public static void display(Employee employee) {
		System.out.println(employee.getEid() +"  " + employee.getEname() + "  "+ employee.getSalary() );

	}

}
