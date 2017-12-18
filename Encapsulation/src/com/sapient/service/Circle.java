package com.sapient.service;

public class Circle {
	private float radius;
	public Circle(float radius) throws Exception {
		super();
		if(radius<= 0){
			throw new Exception("Radius must b greater than zero");
		}
		this.radius = radius;
	}

	public  double areaOfCircle(float radius){
		return Math.PI*radius*radius;

	}
	
	public  double pereimetrOfCircle(float radius){
		return 2*Math.PI*radius;

	}
}
