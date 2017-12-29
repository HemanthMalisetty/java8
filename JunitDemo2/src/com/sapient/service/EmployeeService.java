package com.sapient.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sapient.vo.Employee;

public class EmployeeService {

	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee getEmployee(int eid) throws  EmpNotFoundException{
		Employee employee=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			Connection con=DriverManager.getConnection(url,"system","sapient123");
			String sql="select * from sap_emp where eid=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, eid);
			ResultSet rs=pst.executeQuery();
		
			rs.next();
			if(rs!=null){
				employee=new Employee(rs.getInt(1), rs.getString(2),rs.getDouble(3));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(employee==null)

			throw new EmpNotFoundException();
		return employee;
	}
}
