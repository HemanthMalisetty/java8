package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		Optional<Integer> opt=list.stream().findAny();
		System.out.println(opt);
		
		String str=null;
		Optional<String> res=Optional.ofNullable(str);
		System.out.println(res);
		if(res.isPresent())
			System.out.println(res.get());
		else
			System.out.println("empty");

	}

}
