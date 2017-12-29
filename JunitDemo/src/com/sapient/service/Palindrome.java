package com.sapient.service;

public class Palindrome {
	public boolean checkPalindrome(String str){
//		if(str== null)
//			return null;
		StringBuffer buff=new StringBuffer(str);
		if(str.equals(buff.reverse().toString()))
			return true;
		else
		return false;
	}
	
	public String[] reverseName(String[] arr){
		if(arr==null)
			return null;
		String[] res=new String[arr.length];
		StringBuffer sb;
		int i=0;
		for (String string : arr) {
			sb=new StringBuffer(string);
			res[i]=sb.reverse().toString();
			++i;
		}
		return res;
	}
}
