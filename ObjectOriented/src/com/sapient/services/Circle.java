package com.sapient.services;

public class Circle {
	public float radius;
	public static double areaOfCircle(float radius){
		return Math.PI*radius*radius;

	}
	
	public static double pereimetrOfCircle(float radius){
		return 2*Math.PI*radius;

	}
}
