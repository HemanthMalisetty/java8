package com.sapient.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class SerialiazeDemo  {

	
	
	public static void main(String[] args) throws IOException {
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id");
		int eid = scan.nextInt();
		System.out.println("Enter employee name");
		String name = scan.next();
		System.out.println("enter the salary");
		double sal = scan.nextDouble();*/
		
		FileOutputStream fos = new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//AppendableObjectStream oos = new AppendableObjectStream(fos);
		/*Emp emp1 = new Emp(1001, "ram", 60000);
		Emp emp2 = new Emp(1002, "tom", 45000);*/
		Emp emp3 = new Emp(1005, "peter", 56000);
		oos.writeObject(emp3);
		//oos.reset();
		/*oos.writeObject(emp2);
		oos.writeObject(emp3);*/
		oos.close();
		fos.close();
		System.out.println("serialized");
		
		
	}

}





