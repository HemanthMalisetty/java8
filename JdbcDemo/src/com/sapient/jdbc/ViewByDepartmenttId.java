package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewByDepartmenttId {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		int dept_id;
		System.out.println("Enter the department id");
		dept_id=scanner.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //loading the class
		String url="jdbc:oracle:thin:@localhost:1521:xe"; // database url
		Connection conn=DriverManager.getConnection(url, "system", "Sapient@123");
		
		
		String sql="select * from employee where dept_id=?";
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		preparedStatement.setDouble(1, dept_id);
		
		
		ResultSet resultSet=preparedStatement.executeQuery();
		System.out.println("=============================================================");
		System.out.printf("%15s%15s%10s%10s\n","Empployee Id","Employee name","sal","dept ID");
		System.out.println("=============================================================");
		while(resultSet.next()){
			System.out.printf("%15s%15s%10s%10s",resultSet.getInt(1),resultSet.getString(2),
					resultSet.getFloat(3),resultSet.getInt(4));
			System.out.println();

		}
		System.out.println("============================================================");
		conn.close();
		

	


	}

}
