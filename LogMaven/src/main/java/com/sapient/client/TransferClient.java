package com.sapient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exception.BalanceException;
import com.sapient.exception.IdExceptin;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;

public class TransferClient {

	private static Logger logger=LoggerFactory.getLogger("sapient");
//	private static Logger logger=LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
	public static void main(String[] args) {
		logger.trace("main thread start");
		ISer ser=new SerImpl();
		logger.debug("service instance created");
		try {
			logger.info("transfer the amount RS.5000 from accId 1001 to 1002");
			ser.transfrFund(1001, 1002, 5000);
			logger.info("Succefully transfer");
		} catch (BalanceException | IdExceptin e) {
			logger.error(e.getMessage(),e);
		}
		
		try {
			logger.info("transfer the amount RS.5000 from accId 1003 to 1002");
			ser.transfrFund(1003, 1002, 5000);
			logger.info("Succefully transfer");
		} catch (BalanceException | IdExceptin e) {
			logger.error(e.getMessage(),e);
		}
		
		try {
			logger.info("transfer the amount RS.5000 from accId 1003 to 1002");
			ser.transfrFund(1003, 1002, 5000);
			logger.info("Succefully transfer");
		} catch (BalanceException | IdExceptin e) {
			logger.error(e.getMessage(),e);
		}

	}

}
