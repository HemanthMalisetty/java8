package com.sapient.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.Palindrome;

@RunWith(JUnitPlatform.class)
public class PalindromeTest {
	
	
	private static Palindrome paln;
	
	@BeforeAll
	public static void beforeAll(){
		paln=new Palindrome();
		System.out.println("Before all");
	}
	
}
