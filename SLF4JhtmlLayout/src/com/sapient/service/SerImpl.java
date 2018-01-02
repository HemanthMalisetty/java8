package com.sapient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.dao.DaoImpl;
import com.sapient.dao.IDao;
import com.sapient.exception.BalanceException;
import com.sapient.exception.IdExceptin;
import com.sapient.vo.Account;

public class SerImpl implements ISer {

	private IDao dao;
	private static Logger logger=LoggerFactory.getLogger("sapient");
//	private static Logger logger=LoggerFactory.getLogger("sapient");
	
	
	
	public void setDao(IDao dao) {
		logger.trace("setter setDao()  invoked");
		
		logger.debug("Injectind dao");
		this.dao = dao;
		logger.info("dao initialized");
		
	}

	public SerImpl() {
		logger.trace("service constructure invoked");
		setDao(new DaoImpl());
		logger.info("Service instance is ready with dao instance");
	}

	@Override
	public boolean transfrFund(int fid, int tid, double amt) throws BalanceException, IdExceptin {
		logger.trace("transferfund()  invoked in service");
		Account from=dao.getAccount(fid);
		logger.debug("from account retrieved");
		Account to=dao.getAccount(tid);
		logger.debug("to account retrieved");
		if(from.getBal() < amt)
			throw new BalanceException();
		from.setBal(from.getBal()- amt);
		to.setBal(to.getBal() + amt);
		logger.info("{} and {} account are updated succefully",fid,tid);
		return true;
	}

}
