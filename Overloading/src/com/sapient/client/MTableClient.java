package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.MTable;

public class MTableClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number =scanner.nextInt();
		try {
			MTable mTable=new MTable(number);
			mTable.display();
			System.out.println("Table with rows");
			mTable.display(6);
			System.out.println("Table with start and rows");
			mTable.display(6,3);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
		

	}

}
