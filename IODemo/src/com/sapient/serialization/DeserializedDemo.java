package com.sapient.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("employee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee employee=null;
		
		try {
			while(true){
				employee=(Employee)ois.readObject();
				System.out.println(employee);
				
			}
			
		} catch (EOFException e) {
				System.out.println(e.getMessage());
		}
		
		
		ois.close();
		fis.close();
		

	}

}
