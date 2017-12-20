package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //loading the class
		String url="jdbc:oracle:thin:@localhost:1521:xe"; // database url
		Connection conn=DriverManager.getConnection(url, "system", "Sapient@123");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter staff id");
		int sid=scanner.nextInt();
		System.out.println("Enter staff name");
		String STAFF_NAME=scanner.nextLine();
		System.out.println("Enter staff date of joining");
		String doj=scanner.nextLine();
		System.out.println("Enter staff salary");
		double salary=scanner.nextDouble();
		
		
		String sql="insert into staff values(?,?,?,?,?,?)";
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
