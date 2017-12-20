package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SumAndAverageOfSalary {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //loading the class
		String url="jdbc:oracle:thin:@localhost:1521:xe"; // database url
		Connection conn=DriverManager.getConnection(url, "system", "Sapient@123");
		
		
		String sql="select sum(sal) total, avg(sal) avg_SAlary,count(eid) \"total employee\" from employee";
		PreparedStatement preparedStatement=conn.prepareStatement(sql);
		
		
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()){
			System.out.printf("%25s%25s%15s",resultSet.getDouble("total"),resultSet.getDouble("avg_SAlary"),
					resultSet.getInt("total employee"));
			System.out.println();

		}
		System.out.println("============================================================");
		conn.close();
		

	




	}

}
