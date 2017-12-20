package com.sapient.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo extends ObjectOutputStream{

	protected SerializedDemo() throws IOException, SecurityException {
		super();
		
	}
		
	

	@Override
	protected void writeStreamHeader() throws IOException {
		reset();
	}

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Employee employee= new Employee(1001, "rama", 5000);
		Employee employee1= new Employee(1002, "bhanu", 6000);
		oos.writeObject(employee);
		oos.writeObject(employee1);
		
		oos.close();
		fos.close();
		System.out.println("written");
		

	}

}
