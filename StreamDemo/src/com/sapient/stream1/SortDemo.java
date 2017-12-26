package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

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
		System.out.println("Ascending order");
		Stream<Integer> s=list.stream().sorted();
		s.forEach(System.out::println);
		System.out.println("descending order");
		list.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);
		
	}

}
