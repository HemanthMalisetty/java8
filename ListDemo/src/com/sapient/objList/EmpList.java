package com.sapient.objList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpList {

	public static void main(String[] args) {
		Employee emp1= new Employee(1001, "manav", 5464);
		Employee emp2= new Employee(1003, "weanav", 6456);
		Employee emp3= new Employee(1005, "fwefr", 56456);
		Employee emp4= new Employee(1006, "efwef", 34534);
		Employee emp5= new Employee(1003, "gfwer", 34554);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		System.out.println("====================================");
		System.out.println("Sorting based on comparable eid");
		System.out.println("====================================");
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("==================================");
		System.out.println("sorting based on name comparator");
		System.out.println("====================================");
		
		Collections.sort(list,new NameComparator());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("====================================");
		System.out.println("sorting based on sal comparator");
		System.out.println("====================================");
		Collections.sort(list,new SalComparator());
		for (Employee employee : list) {
			System.out.println(employee);
		}

		
	}

}
