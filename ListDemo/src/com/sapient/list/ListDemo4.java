package com.sapient.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo4 {

	public static void main(String[] args) {
		List<String> list=new Vector<String>();
		list.add("bhalua");
		list.add("Ashu");
		list.add("pandey");
		list.add("mandu");
		
		System.out.println(list);
		
		list.add(2, "NNNNTTTTRRRRR");
		System.out.println(list);
		
		System.out.println(list.remove(3));
		System.out.println(list);
		
		//---------------------------------------------------------
		List<String> list2=new ArrayList<String>();
		list2.add("paglu");
		list2.add("timbu");
		list2.addAll(list);
		System.out.println(list2);
		
		//-----------------------------------------------------

	}

}
