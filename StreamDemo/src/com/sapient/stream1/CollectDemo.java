package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list);
		
		//converting stream into collection
		Stream<Integer> s=list.stream().filter(i-> i%2==0);
		List<Integer> list1=s.collect(Collectors.toList());
		System.out.println("displaying list 2 having filtered elements");
		list1.forEach(System.out::println);
		
		//converting stream into array
		System.out.println("displaying array having filter elements");
		Stream<Integer> s2=list.stream().filter(i->i%3==0);
		
		Object[] arr=s2.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
