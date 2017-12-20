package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewEidDepartmentName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //loading the class
		String url="jdbc:oracle:thin:@localhost:1521:xe"; // database url
		Connection conn=DriverManager.getConnection(url, "system", "Sapient@123");
		
		
		String sql="select e.eid ,e.ename, e.sal,d.dname from employee e inner join dept d on e.dept_id=d.did";
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		
		
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1)+"	"+resultSet.getString(2)+"	"+resultSet.getDouble(3)+"	"+
					resultSet.getString(4));
			System.out.println();

		}
		System.out.println("============================================================");
		conn.close();
		

	




	
	}

}
