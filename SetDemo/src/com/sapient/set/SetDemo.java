package com.sapient.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		
		//It will store randomly
		//		Set<String> set=new HashSet<String>();
//		
//		set.add("rama");
//		set.add("sama");
//		set.add("tama");
//		set.add("mama");
//		set.add("lamba");
//		set.add("sambha");
		
		
		//it will store in the sequence of insertion
//		Set<String> set=new LinkedHashSet<String>();
//		
//		set.add("rama");
//		set.add("sama");
//		set.add("tama");
//		set.add("mama");
//		set.add("lamba");
//		set.add("sambha");
		
		//TreeSet using sorting during adding and removing
		Set<String> set=new TreeSet<String>();
		
		set.add("rama");
		set.add("sama");
		set.add("tama");
		set.add("mama");
		set.add("lamba");
		set.add("sambha");

		
		for (String string : set) {
			System.out.println(string);
		}
		

	}

}
