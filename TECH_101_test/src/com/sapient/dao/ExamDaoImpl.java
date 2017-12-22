package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sapient.vo.Questions;

public class ExamDaoImpl implements IDao {
	private static IDao dao=new ExamDaoImpl();
	
	private ExamDaoImpl(){
		
	}
	
	public static IDao getDaoInstance(){
		return dao;
	}
	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public Map<Integer, Questions> viewQuestios() {
		Map<Integer,Questions> map= new HashMap<>();
		Questions questions=null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
				
		try(Connection con=DriverManager.getConnection(url,"system","Sapient@123")){
			String sql="select * from questions";
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			Questions question=null;
			while(rs.next()){
//				System.out.println(question.);
				question=new Questions(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				map.put(question.getQid(), question);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			
		}
		
		return map;
	}
	
	
/*	
	public Map<Integer, Questions> viewQuestios() {
		Map<Integer,Questions> map= new HashMap<>();
		Questions questions=null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		try(Connection con=DriverManager.getConnection(url,"system","Sapient@123")){
			
		}
		
		return map;
	}
*/

//	@Override
//	public Map<Integer, Questions> viewQuestios() throws SQLException try {
//		
//			Map<Integer,Questions> map= new HashMap<>();
//			Questions questions=null;
//			String url="jdbc:oracle:thin:@localhost:1521:xe";
//			try(Connection con=DriverManager.getConnection(url,"system","Sapient@123")){
//				
//			}
//			return map;
//		
//			catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	
//			}
}
