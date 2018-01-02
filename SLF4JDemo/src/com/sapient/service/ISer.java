package com.sapient.service;

import com.sapient.exception.BalanceException;
import com.sapient.exception.IdExceptin;

public interface ISer {
	public boolean transfrFund(int fid,int tid,double amt) throws BalanceException,IdExceptin;
}
