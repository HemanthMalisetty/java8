package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

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
		System.out.println("using method reference");
		list.stream().forEach(System.out::println);
		System.out.println("using lambda expr");
		list.stream().forEach(s->System.out.println(s));

	}

}
