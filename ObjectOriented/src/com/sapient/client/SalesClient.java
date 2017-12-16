package com.sapient.client;

import com.sapient.services.SalesPerson;

public class SalesClient {

	public static void main(String[] args) {
		SalesPerson s1= new SalesPerson(1001, "Maroon", 45000);
		SalesPerson s2=new SalesPerson(1002, "Tarun", 60000);
		SalesPerson s3=new SalesPerson(1003, "Varun", 10000);
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("Total sales:"+ s1.totalSales);
		System.out.println("Total sales person:"+ s1.totalPerson);

	}

}
