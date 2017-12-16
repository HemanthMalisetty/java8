package com.sapient.audi.dao;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		float radius=scanner.nextFloat();
		System.out.println("Area of circle: "+ areaOfCircle(radius));
		System.out.println("Perimeter of circle: "+ pereimetrOfCircle(radius));

	}
	
	public static double areaOfCircle(float radius){
		return Math.PI*radius*radius;

	}
	
	public static double pereimetrOfCircle(float radius){
		return 2*Math.PI*radius;

	}

}
