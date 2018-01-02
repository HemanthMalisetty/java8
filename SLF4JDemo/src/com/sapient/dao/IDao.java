package com.sapient.dao;

import com.sapient.exception.IdExceptin;
import com.sapient.vo.Account;

public interface IDao {
	public Account getAccount(int aid) throws IdExceptin;
}
