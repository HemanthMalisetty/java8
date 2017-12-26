package com.sapient.defaultDemo;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		DefaultDao dao=new DefaultDaoImpl3();
		dao.m1();
		dao.m2();
		List<String> lst=Arrays.asList("ram","tom","peter");
		dao.m3(lst);

	}

}
