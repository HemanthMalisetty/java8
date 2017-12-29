package com.sapient.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;
import com.sapient.service.Factory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@RunWith(JUnitPlatform.class)
public class CalcTest {
	
	public void testSeries(){
		CalcService ser=Factory.getCalcservice();
		assumeTrue(ser != null);
//		assertTrue(7.5,ser.calcSeries(5, 5, 5));
	}
	
	public void testSeries1(){
		CalcService ser=Factory.getCalcservice();
//		assumingThat(ser !=null, ()->assertTrue(7.5,ser.calcSeries(5, 5, 5)));
	}
}
