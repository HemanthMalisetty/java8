package com.sapient.objList;

import java.util.Comparator;

public class SalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Double sal1=o1.getSal();
		Double sal2=o2.getSal();
		return sal1.compareTo(sal2);
	}

}
