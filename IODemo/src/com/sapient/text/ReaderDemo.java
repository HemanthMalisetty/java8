package com.sapient.text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("sap.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader,2 * 1024 * 1024);
		String str=null;
		while((str=bufferedReader.readLine()) !=null){
			System.out.println(str);
		}
		
//		System.out.println(bufferedReader.si);
		bufferedReader.close();
		fileReader.close();
		
	}

}
