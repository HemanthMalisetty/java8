package com.sapient.objList;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	
	
	
	

	@Override
	public int compare(Employee emp1,Employee emp2) {
		String name1=emp1.getEname();
		String name2=emp2.getEname();
		return name1.compareTo(name2);
	}

	
}
