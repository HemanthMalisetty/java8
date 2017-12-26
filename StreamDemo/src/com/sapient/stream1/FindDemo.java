package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("shilong","goa","shimla","gangtok");
		Optional<String> opt=list.stream().filter(s-> s.startsWith("h")).findFirst();
		System.out.println(opt);
		if(opt.isPresent())
			System.out.println("Element  found");
		else
			System.out.println("Element not found");
	}

}
