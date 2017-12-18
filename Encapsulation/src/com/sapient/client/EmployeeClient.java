package com.sapient.client;

import com.sapient.service.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee employee=new Employee();
		try {
			employee.setAge(23);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
