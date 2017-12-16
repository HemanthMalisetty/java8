package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.Circle;

public class ClientCircle {

	public static void main(String[] args) {
		
		Circle circle=new Circle();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		float radius=scanner.nextFloat();
		System.out.println("Area of circle: "+ circle.areaOfCircle(radius));
		System.out.println("Perimeter of circle: "+ circle.pereimetrOfCircle(radius));

	}

}
