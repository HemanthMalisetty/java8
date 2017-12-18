package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;


public class ClientCircle {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		float radius=scanner.nextFloat();
		Circle circle;
		try {
			circle = new Circle(radius);
			System.out.println("Area of circle: "+ circle.areaOfCircle(radius));
			System.out.println("Perimeter of circle: "+ circle.pereimetrOfCircle(radius));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		scanner.close();
	}

}
