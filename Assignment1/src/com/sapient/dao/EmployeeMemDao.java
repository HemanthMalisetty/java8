package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Employee;

public class EmployeeMemDao implements IDao{
	public static Map<Integer,Employee> empMap;
	
	static {
		empMap=new HashMap<Integer,Employee>();
		empMap.put(1001, new Employee(1001, "rama", 45000, 1, LocalDate.of(2014, 3, 21)));
		empMap.put(1002, new Employee(1002, "Sama", 45000, 1, LocalDate.of(2015, 5, 21)));
		empMap.put(1003, new Employee(1003, "DRAMA", 25365, 1, LocalDate.of(2014, 6, 11)));
	}

	@Override
	public List<Employee> viewEmployee() throws NotFoundException {
		List<Employee> list=new ArrayList<Employee>();
		list.addAll(empMap.values());
		return list;
	}

	@Override
	public Employee viewEmployee(int eid) throws IdException, NotFoundException {
		if(!empMap.containsKey(eid))
			throw new NotFoundException("Employee not found");
		Employee emp=empMap.get(eid);
				return emp;
	}

	@Override
	public int addEmployee(Employee emp) throws IdException {
		
		if(empMap.containsKey(emp.getDeptId()))
			throw new IdException("Employee already exist");
		else 
			empMap.put(emp.getEmpId(), emp);
		return emp.getEmpId();
	}

	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSalary(int eid, double salary) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}
}