package com.sapient.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sapient.dao.IDao;
import com.sapient.exception.BalanceException;
import com.sapient.exception.IdExceptin;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;
import com.sapient.vo.Account;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class TransferTest {

	@Mock
	IDao dao;
	
	@InjectMocks
	ISer ser=new SerImpl();
	
	private static Account account1,account2,account3;
	@BeforeAll
	public static  void beforeAll(){
		account1=new Account(1001, "faizal", 10000);
		account2=new Account(1002, "perpendicuar", 5000);
		account3=new Account(1003, "tangent", 2000);
	}
	
	@BeforeEach
	public void beforeEach() throws IdExceptin{
		when(dao.getAccount(1001)).thenReturn(account1);
		when(dao.getAccount(1002)).thenReturn(account2);
		when(dao.getAccount(1003)).thenReturn(account3);
		when(dao.getAccount(1004)).thenThrow(IdExceptin.class);
	}
	
	@Test
	public void testFund1() throws BalanceException, IdExceptin{
		
		assumeTrue(ser!=null);
		assertAll("Transfer fund", ()->assertTrue( ser.transfrFund(1001, 1002, 5000)),
									()->assertEquals(5000,account1.getBal()),
									()->assertEquals(10000,account2.getBal())
									);
	}
	
	@Test
	public void testFund2() throws BalanceException, IdExceptin{
		assumeTrue(ser!=null);
		assertThrows(BalanceException.class, ()->ser.transfrFund(1003, 1002, 5000));
	}
	
	@Test
	public void testFund3() throws BalanceException, IdExceptin{
		assumeTrue(ser!=null);
		assertThrows(IdExceptin.class, ()->ser.transfrFund(1002, 1004, 10000));
	}
	
	
	
}
