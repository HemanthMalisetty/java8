package com.sapient.defaultDemo;

import java.util.List;

public class DefaultDaoImpl implements DefaultDao {

	@Override
	public void m1() {
		System.out.println("impl2-->m1");

	}

	@Override
	public void m2() {
		System.out.println("impl2-->m2");

	}

	@Override
	public void m3(List<String> lst) {
		lst.forEach(System.out::println);
//		DefaultDao.super.m3(lst);
	}

}
