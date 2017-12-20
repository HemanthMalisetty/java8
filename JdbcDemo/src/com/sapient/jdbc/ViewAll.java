package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAll {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //loading the class
		String url="jdbc:oracle:thin:@localhost:1521:xe"; // database url
		Connection conn=DriverManager.getConnection(url, "system", "Sapient@123");
		String sql="select * from employee";
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		System.out.println("=============================================================");
		System.out.printf("%15s%15s%10s%10s\n","Empployee Id","Employee name","salary","dept ID");
		System.out.println("=============================================================");
		while(resultSet.next()){
			System.out.printf("%15s%15s%10s%10s",resultSet.getInt(1),resultSet.getString(2),
					resultSet.getFloat(3),resultSet.getInt(4));
			System.out.println();

		}
		System.out.println("============================================================");
		conn.close();
		
//		System.out.println("hello");
	}

}
