package com.sapient.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("bhalua");
		list.add("Ashu");
		list.add("pandey");
		
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}

	}

}
