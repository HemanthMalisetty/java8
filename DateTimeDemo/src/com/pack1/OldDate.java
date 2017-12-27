package com.pack1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class OldDate {

	public static void main(String[] args) {
		DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN);
		Date dt=new Date();
		System.out.println(dt);
		
		DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH);
		Calendar cal=Calendar.getInstance();
		System.out.println(df2.format(cal.getTime()));
		
		
		
	}

}
