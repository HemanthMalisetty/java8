package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1444);
		list.add(43);
		list.add(345);
		list.add(54);
		list.add(21);
		list.add(65);
		list.add(67);
		list.add(87);
		list.add(93);
		System.out.println(list);
		
		Long size=list.stream().filter(i->i>=50).count();
		System.out.println("No of element greater than 50"+ size);
		
		OptionalInt  optionalInt=list.stream().mapToInt(i->i).min();
		System.out.println("minimum value: "+ optionalInt.getAsInt());
		OptionalInt  optionalInt1=list.stream().mapToInt(i->i).max();
		System.out.println("max value: "+ optionalInt1.getAsInt());
		int sum=list.stream().mapToInt(i->i).sum();
		System.out.println("sum value: "+ sum);
		OptionalDouble  optionalInt3=list.stream().mapToInt(i->i).average();
		System.out.println("avg value: "+ optionalInt3.getAsDouble());

	}

}
