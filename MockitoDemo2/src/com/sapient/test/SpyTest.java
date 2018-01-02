package com.sapient.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(JUnitPlatform.class)
public class SpyTest {
	
	
	/*
	 * demonstration on spy object
	 * spy works on real implementation to check whether 
	 * there stubbing is done or not.As below code
	 * using mock it doesnt know the real implementation of list
	 * so it will faild to pass the test but when we use spy it knows the real implementation 
	 * of ArrayList of list.
	 */
	@Test
	public void m1(){
		List<String> list=Mockito.mock(List.class);
		list.add("ram");
		list.add("tom");
		System.out.println("list content: "+list);
		System.out.println("list size: "+ list.size());
		assertTrue(list.size()==2);
	}
	
	@Test
	public void m2(){
		List<String> list=Mockito.spy(new ArrayList<>());
		list.add("ram");
		list.add("tom");
		System.out.println("list size: "+ list.size());
		assertTrue(list.size()==2);
	}
	
	@Test
	public void m3(){
		List<String> list=Mockito.spy(new ArrayList<>());
		Mockito.when(list.size()).thenReturn(100);
		
		System.out.println("list size: "+ list.size());
		assertTrue(list.size()==100);
	}
}
