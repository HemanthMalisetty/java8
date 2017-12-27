package com.pack1;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConvirsionDemo {

	public static void main(String[] args) {
		//Convert instnt into localdate
		Instant ins=Instant.now();
		ZonedDateTime zt=ins.atZone(ZoneId.systemDefault());
		LocalDate dt=zt.toLocalDate();
		
		//COnvert LocalDate in to java.sql.Date
		
		LocalDate ldt=LocalDate.now();
		java.sql.Date sqldt=Date.valueOf(ldt);
		System.out.println("SQL date: "+ sqldt);
		
		
		//convert java.sql.Date to LocalDate
		LocalDate ldt2=sqldt.toLocalDate();
		System.out.println(ldt2);
	}

}
