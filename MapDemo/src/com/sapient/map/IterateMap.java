package com.sapient.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IterateMap {

	public static void main(String[] args) {
		
//		Map<Integer,String> map= new HashMap<Integer,String>();
		Map<Integer,String> map= new TreeMap<Integer,String>();
		
		
		map.put(1001, "rama");
		map.put(1003, "tama");
		map.put(1004, "masa");
		map.put(1005, "sasa");
		map.put(1006, "khasa");
		map.put(1007, "phasa");
		map.put(1002, "sambha");
		map.put(1010, "");
		
		Set<Integer> set=map.keySet();
		for (Integer key : set) {
			System.out.println(key+ "          "+map.get(key));
		}
		
		System.out.println("Iterating using values");
		Collection<String> col=map.values();
		for (String string : col) {
			System.out.println(string);
		}
		
		System.out.println("Iterating using entry innstance");

		Set<Entry<Integer,String>> entries= map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry);
		}
	}
	
	

}
