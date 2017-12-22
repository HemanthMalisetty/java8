package com.sapient.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {
		
		 
		String string=null;
		try (BufferedReader br=new BufferedReader(new FileReader("sap.txt"))){
			while((string=br.readLine() )!=null){
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		
		}
		catch (IOException e) {
			// TODO: handle exception
		}


	}

}
