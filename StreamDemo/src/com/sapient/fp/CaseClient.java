package com.sapient.fp;

public class CaseClient {

	/**
	 * Demo on- Functional Programming
	 * @param args
	 */
	public static void main(String[] args) {
		ICase lower= s-> s.toLowerCase();
		ICase upper= (String s) -> {return s.toUpperCase();};
		display(lower, "MANAV");
		
		
		/**
		 * we can pass code to a methd when method having functinal interface 
		 * parameter.
		 */
		display(s-> s.toLowerCase(), "MANAV");
		display((String s) -> {return s.toUpperCase();}, "ravan");

	}
	
	public static void display(ICase obj, String str){
		String res=obj.changeCase(str);
		System.out.println(res);
	}

}
