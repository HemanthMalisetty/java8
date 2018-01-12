package com.sapient.dao;

import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Department;
import com.sapient.vo.Employee;

public interface IDao {
	List<Employee> viewAllEmployee() ;
	Employee viewEmployee(int eid) throws  NotFoundException;
	int addEmployee(Employee emp)throws IdException;
	int removeEmployee(int eid) throws NotFoundException;
	int updateSalary(int eid,double salary) throws NotFoundException;
	List<Department> viewDepartments();
	List<Employee> viewByDepartmentId(int deptid);
}


//List<Emp> viewEmployee();
//Emp viewEmployee(int eid) throws NotFoundException;
//int addEmployee(Emp emp) throws IdException;
//int removeEmployee(int eid) throws NotFoundException;
//int updateEmployee(int eid, double sal)throws NotFoundException;
