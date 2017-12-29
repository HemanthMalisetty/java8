package com.sapient.service;

import java.util.Comparator;
import java.util.List;

import com.sapient.dao.EmployeeDao;
import com.sapient.vo.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	
	
	private EmployeeDao dao;
	
	
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Employee> viewEmployees(String order) {
		List<Employee> list=dao.getEmployee();
//		Comparator<Employee> idcomp=(e1,e2)-> ((Integer)e1.getEid()).compareTo((Integer)e2.getEid());
		
		if(order.equals("id")){
			list.sort((e1,e2)-> ((Integer)e1.getEid()).compareTo((Integer)e2.getEid()));
//			list.sort(idcomp);
		}
		else if(order.equals("name")){
			list.sort((e1,e2)-> (e1.getEname()).compareTo(e2.getEname()));
		}
		else if(order.equals("sal")){
			list.sort((e1,e2)-> ((Double)e1.getSalary()).compareTo((Double)e2.getSalary()));
		}
		else{
			return null;
		}
		
		return list;
		
	}

}
