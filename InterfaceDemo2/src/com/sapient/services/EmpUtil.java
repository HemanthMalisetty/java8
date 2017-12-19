package com.sapient.services;

import java.util.ResourceBundle;

public class EmpUtil {
		private static ResourceBundle rb;
		static IDao dao=null;
		static{
			rb=ResourceBundle.getBundle("sap");
			try {
				Class cls=Class.forName(rb.getString("cname")); // to load the class explictily
				dao=(IDao)cls.newInstance();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		public static IDao getDaoInstance(){
		
			
			return dao;
		}
		

		
}		
		