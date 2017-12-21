package com.sapient.arr;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {
		String [] arr=new String[4];
		arr[0]="rama";
		arr[1]="peter";
		arr[2]="philipse";
		arr[3]="kepler";
		
		Arrays.sort(arr);
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("Descending order");
		Arrays.sort(arr,Collections.reverseOrder());
		for (String string : arr) {
			System.out.println(string);
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		

	}

}
