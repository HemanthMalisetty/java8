package com.sapient.list;

import java.util.Arrays;
import java.util.List;

public class ListDemo6 {

	public static void main(String[] args) {
		Integer[] arr={4,5,6,7,8,2};
		List<Integer> list=(List<Integer>)Arrays.asList(arr);
		System.out.println(list);

	}

}
