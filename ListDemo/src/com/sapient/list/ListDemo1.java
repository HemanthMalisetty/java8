package com.sapient.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(67);
		lst.add("ram");
		
		for(Object obj: lst){
			if (obj instanceof Integer){
				int val = (int)obj;
				System.out.println(val+2);
			}else if(obj instanceof String){
				String str = (String)obj;
				System.out.println(str.toUpperCase());
			}
				
		}
	}

}
