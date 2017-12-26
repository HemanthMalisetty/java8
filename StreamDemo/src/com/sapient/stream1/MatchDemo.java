package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class MatchDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		
		
		System.out.println(list.stream().anyMatch(i-> i%2==0));
		System.out.println(list.stream().allMatch(i-> i%2==0));
		System.out.println(list.stream().noneMatch(i-> i>=50));

	}

}
