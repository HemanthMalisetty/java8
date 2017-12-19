package com.sapient.client;

import com.sapient.services.EmpUtil;
import com.sapient.services.IDao;

public class EmpClient {

	public static void main(String[] args) {
		IDao dao=EmpUtil.getDaoInstance();
		System.out.println(dao);
		System.out.println(dao.viewEmployee());
	}

}
