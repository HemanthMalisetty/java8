package com.sapient.client;

import com.sapient.services.Computer;
import com.sapient.services.Mobile;
import com.sapient.services.Product;

public class ProductClient {

	public static void main(String[] args) {
		Product[] arr= new Product[5];
		arr[0]=new Computer(1001, "Acer Laptop", 35000, "4tb");
		arr[1]=new Computer(1002, "Dell Laptop", 10000, "1tb");
		arr[2]=new Computer(1003, "Mac Book", 80000, "2tb");
		arr[3]=new Mobile(1004, "Sony Mobile", 35000, "12mp");
		arr[4]=new Mobile(1005, "Xiomi", 10000, "8mp");
		System.out.println("======================================================================================================================");
		System.out.printf("%10s%20s%10s%10s%10s%20s%20s\n","PID","PNAME","PRICE","HDD","CAM","RANGE","TYPE");
		System.out.println("======================================================================================================================");
		for (Product product : arr) {
			product.display();
		}

	}

}
