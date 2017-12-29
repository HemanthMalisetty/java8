package com.sapient.service;

import java.util.List;

import com.sapient.vo.Employee;

public interface EmployeeService {
	List<Employee> viewEmployees(String order);
}
