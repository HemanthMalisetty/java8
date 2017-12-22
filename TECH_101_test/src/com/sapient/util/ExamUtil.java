package com.sapient.util;

import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;

import java.util.Set;

public class ExamUtil {
	
	public static final String DRIVER;
	public static final String URL;
	public static final String USERNAME;
	public static final String PASSWORD;
	
	static{
		ResourceBundle rb=ResourceBundle.getBundle("sap");
		DRIVER= rb.getString("driver");
		URL=rb.getString("url");
		USERNAME=rb.getString("username");
		PASSWORD=rb.getString("password");
	}
	
	public static Set<Integer> generateUniqueNOs(int n){
		Set<Integer> set=new HashSet<>();
		
		Random r=new Random();
		while(set.size()<n){
			set.add(r.nextInt(15) + 1);
		}
		
		return set;
	}
}
