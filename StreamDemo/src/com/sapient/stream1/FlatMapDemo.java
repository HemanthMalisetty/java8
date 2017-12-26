package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("shilong","goa","shimla","gangtok");
		List<String> list2=Arrays.asList("bhawana","madhuri","priya","bandana");
		
		
		Stream<List<String>> s=Stream.of(list1,list2);
		
		Stream<String> s2=s.flatMap(list->list.stream());
		s2.forEach(System.out::println);

	}

}
