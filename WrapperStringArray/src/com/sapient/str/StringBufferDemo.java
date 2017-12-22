package com.sapient.str;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Sapient");
		System.out.println(str);
		str.append(" Razorfish");
		System.out.println(str);
		str.insert(7, " nitro");
		System.out.println(str);
		str.delete(7, 14);
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		str.reverse();
		System.out.println(str);

	}

}
