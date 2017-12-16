package com.sapient.util;

public class SapUtil {
	public static double roundUpTo2Decimal(double value) {
		return Math.round(value * 100)/100.0;
	}
}
