package com.sapient.create;

public class EmployeeClient {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls=Class.forName("com.sapient.create.Employee");
		Employee employee= (Employee) cls.newInstance();
		employee.display();
	}

}
