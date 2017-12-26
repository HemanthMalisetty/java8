package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

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
		
		Integer res=list.stream().map(i->i).reduce(0,(x,y)->x+y);
		/**
		 * sum=0
		 * (x,y)----sum=x and y is element 
		 */
		System.out.println("sum of all element: "+ res);
		Integer res1=list.stream().map(i->i).filter(i-> i%2==0).map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("sum of element divisable by two: "+res1 );

	}

}
