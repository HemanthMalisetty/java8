package com.sapient.dao;

import static com.sapient.util.Factory.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Department;
import com.sapient.vo.Employee;

public class EmployeeJdbcDao implements IDao {

	@Override
	public List<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee viewEmployee(int eid) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(Employee emp) throws IdException {
		String sql="insert into Employee values(?,?,?,?,?)";
		int result=0;
		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
//			pst.setInt(1, product.getPid());
//			pst.setString(2, product.getPname());
//			pst.setDouble(3, product.getPrice());
//			pst.setString(4, product.getBrand());
//			pst.setInt(5, product.getCid());
			result=pst.executeUpdate();
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
		
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

	@Override
	public List<Department> viewDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> viewByDepartmentId() {
		// TODO Auto-generated method stub
		return null;
	}

}
