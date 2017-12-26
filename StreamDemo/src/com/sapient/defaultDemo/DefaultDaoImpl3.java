package com.sapient.defaultDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DefaultDaoImpl3 implements DefaultDao {

	@Override
	public void m1() {
		System.out.println("impl3-->m1");

	}

	@Override
	public void m2() {
		System.out.println("impl3-->m1");

	}

	@Override
	public void m3(List<String> lst) {
		Collections.sort(lst);
		DefaultDao.super.m3(lst);
	}

}
