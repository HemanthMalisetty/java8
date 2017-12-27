package com.pack1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		LocalDate dt1=LocalDate.of(2016, 2, 16);
		LocalDate dt2=LocalDate.of(2017, 2, 16);
		Period p=Period.between(dt1, dt2);
		System.out.println(p.getDays()+ " days");
		System.out.println(p.getMonths()+ " months");
		System.out.println(p.getYears()+ " years");
		
		
		//duration between time or datetime returns seconds/nano
		LocalTime t1=LocalTime.of(11, 15, 50);
		LocalTime t2=LocalTime.now();
		Duration d=Duration.between(t1, t2);
		System.out.println(d.getSeconds());
		
		

	}

}
