package com.sapient.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("sap.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fw);
		//Buffer writer will write to file as a buffer
		bufferedWriter.write("\nA specialized content on Java & Web Technologies for SapientRazorfish  ");
		fw.write("hello rahul");// it will write character by character to the file
		bufferedWriter.close();
		fw.close();


	}

}
