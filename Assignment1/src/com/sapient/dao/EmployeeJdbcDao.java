package com.sapient.dao;

import static com.sapient.util.Factory.*;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Department;
import com.sapient.vo.Employee;

public class EmployeeJdbcDao implements IDao {

	@Override
	public List<Employee> viewAllEmployee() {
		String sql="select * from employee";
		List<Employee> empList=new ArrayList<Employee>();
		Employee employee=new Employee();
		ResultSet rs;

		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setDeptId(rs.getInt(4));
				employee.setDate(rs.getDate(5).toLocalDate());
				empList.add(employee);
			}
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return empList;
	
	}

	@Override
	public Employee viewEmployee(int eid) throws NotFoundException {
		String sql="select * from employee where eid=?";
		Employee employee=new Employee();
		ResultSet rs;
		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, eid);
			rs=pst.executeQuery();
			while(rs.next()){
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setDeptId(rs.getInt(4));
				employee.setDate(rs.getDate(5).toLocalDate());
				
			}
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return employee;
	}

	@Override
	public int addEmployee(Employee emp) throws IdException {
		String sql="insert into Employee values(?,?,?,?,?)";
		int result=0;
		Date doj=Date.valueOf(emp.getDate());
		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, emp.getEmpId());
			pst.setString(2, emp.getEmpName());
			pst.setDouble(3, emp.getSalary());
			pst.setInt(4, emp.getDeptId());
			pst.setDate(5, doj);
			result=pst.executeUpdate();
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
		
	}

	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		String sql="delete from employee where eid=?";
		int result=0;
		
		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, eid);
			result=pst.executeUpdate();
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
		
	}

	@Override
	public int updateSalary(int eid, double salary) throws NotFoundException {
		String sql="update employee set salary=? where eid=?";
		int result=0;
		
		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setDouble(1, salary);
			pst.setInt(2, eid);
			result=pst.executeUpdate();
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return result;
	}

	@Override
	public List<Department> viewDepartments() {
		String sql="select * from department";
		List<Department> deptList=new ArrayList<Department>();
		Department department=new Department();
		ResultSet rs;
		
		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				department.setDid(rs.getInt(1));
				department.setDname(rs.getString(2));
				deptList.add(department);
			}
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return deptList;
	}

	@Override
	public List<Employee> viewByDepartmentId(int deptid) {
		String sql="select * from employee where deptid=?";
		List<Employee> empList=new ArrayList<Employee>();
		Employee employee=new Employee();
		ResultSet rs;
//		Date now = new Date();
//		LocalDate current = now.toInstant()
//		                       .atZone(ZoneId.systemDefault()) // Specify the correct timezone
//		                       .toLocalDate();
		try(Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD)){
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, deptid);
			rs=pst.executeQuery();
			while(rs.next()){
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setDeptId(rs.getInt(4));
				employee.setDate(rs.getDate(5).toLocalDate());
				empList.add(employee);
			}
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return empList;
	}

}
