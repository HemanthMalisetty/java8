package com.sapient.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;

import com.sapient.service.Palindrome;

@RunWith(JUnitPlatform.class)
public class ParameterTest {
	
	private static Palindrome obj;
	
	@BeforeAll
	public static void beforeAll(){
		obj=new Palindrome();
	}
	
	
	@AfterAll
	public void afterAll(){
		obj=null;
	}
	
	@ParameterizedTest
	@ValueSource(strings={"nitin","kayak","malayalam"})
	public void testPalindrome1(String str){
		assertTrue(obj.checkPalindrome(str));
	}
	
}
