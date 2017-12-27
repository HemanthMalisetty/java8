package com.pack1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {

	public static void main(String[] args) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		//convert date
		String str="12-Feb-2017";
		LocalDate ldt=LocalDate.parse(str,df);
		System.out.println(ldt);
		
		LocalDate ldt2=LocalDate.of(2016, 07, 03);
		System.out.println(ldt2.format(df));

	}

}
