package com.sapient.dao;

import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Employee;

public interface IDao {
	List<Employee> viewEmployee() throws NotFoundException;
	Employee viewEmployee(int eid) throws IdException, NotFoundException;
	int addEmployee(Employee emp)throws IdException;
	int removeEmployee(int eid) throws NotFoundException;
	int updateSalary(int eid,double salary) throws NotFoundException;
}
