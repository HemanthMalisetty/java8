package com.sapient.services;

import java.util.ArrayList;
import java.util.List;

public class EmpMemDao implements IDao{
	
	

	public EmpMemDao() {
//		Instance can not be created another package
	}

	@Override
	public List<String> viewEmployee() {
		List<String> list=new ArrayList<String>();
		list.add("Rama");
		list.add("sambha");
		list.add("Bharat");
		list.add("Raone");
		return list;
	}
	
}
