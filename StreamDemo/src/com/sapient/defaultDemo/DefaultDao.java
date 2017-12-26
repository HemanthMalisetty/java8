package com.sapient.defaultDemo;

import java.util.List;

public interface DefaultDao {
	public void m1();
	public void m2();
	default public void m3(List<String> lst){
		System.out.println(lst);
	}
}
