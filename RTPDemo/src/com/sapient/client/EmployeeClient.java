package com.sapient.client;

import com.sapient.services.ContractEmployee;
import com.sapient.services.Employee;
import com.sapient.services.OnrollEmployee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee[] employee=new Employee[4];
		employee[0]=new OnrollEmployee(1001, "SUMAN", 23000);
		employee[1]=new OnrollEmployee(1002, "TUMAN", 2000);
		employee[2]=new ContractEmployee(1003, "DUMAN", 6000,5);
		employee[3]=new ContractEmployee(1004, "RUMAN", 600,65);
		
//		emptId, empName, sal, da, pf, days, net salary and employee type
		
		System.out.println("======================================================================================================================");
		System.out.printf("%10s%20s%10s%10s%10s%10s%10s%20s\n","EID","ENAME","SALARY","DA","PF","DAYS","NET SALARY","EMPLOYEE TYPE");
		System.out.println("======================================================================================================================");
		
		for (Employee employee2 : employee) {
			employee2.display();
		}

	}

}
