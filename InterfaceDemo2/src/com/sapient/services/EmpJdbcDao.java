package com.sapient.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpJdbcDao implements IDao{
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public List<String> viewEmployee() {
		List<String> list= new ArrayList<>();
		Connection con=null;
		try {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			con=DriverManager.getConnection(url,"system","Sapient@123");
			String sql="select * from employee";
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				list.add(rs.getString(2));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			closeConnection(con);
		}
		return list;
	}
	
	public void closeConnection(Connection conn){
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	}

}
