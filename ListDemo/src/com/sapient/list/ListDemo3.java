package com.sapient.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("bhalua");
		list.add("Ashu");
		list.add("pandey");
		list.add("mandu");
		Collections.sort(list);
		
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
//		itr.remove();
//		ListIterator<String> itr1=list.listIterator();
		
		System.out.println("\nfrom last\n");
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		
		
		

	}

}
