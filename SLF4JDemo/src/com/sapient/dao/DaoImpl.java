package com.sapient.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exception.IdExceptin;
import com.sapient.vo.Account;

public class DaoImpl implements IDao {

	private static Map<Integer,Account> aMap;
	private static Logger logger=LoggerFactory.getLogger("sapient");
	
	
	static{
		logger.trace("static block called in dao");
		aMap=new HashMap<Integer, Account>();
		aMap.put(1001, new Account(1001, "Faizal",1000));
		aMap.put(1001, new Account(1002, "Definite",11000));
		aMap.put(1001, new Account(1003, "Saradar",15000));
		aMap.put(1001, new Account(1004, "Tangent",17000));
		logger.debug("Has map has initialized with 3 account instance");
	}
	@Override
	public Account getAccount(int aid) throws IdExceptin {
		logger.trace("getAccount() Invoked");
		logger.debug("checking the aid against map key");
		if(!aMap.containsKey(aid))
			throw new IdExceptin("Id not found");
		logger.info("account id {}  found",aid);
		return aMap.get(aid);
	}

}
