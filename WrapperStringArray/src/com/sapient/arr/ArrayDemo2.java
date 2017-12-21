package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		String [] arr={"rama","sasa","sdfsd","asdad","ewrwe"};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.next();
		int res=Arrays.binarySearch(arr, str);
		
		if(res>0)
			System.out.println("found: "+ res);
		else System.out.println("not found");
	}

}
