package com.sapient.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props= new Properties();
		props.put("1001", "Ram");
		props.put("1002", "Lakshman");
		
		props.load(new FileReader("src\\sap.properties"));
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
		System.out.println(props.getProperty("1002"));
		System.out.println("size: "+props.size());
		Set<Object> keys=props.keySet();
//		props.forEach(props.getProperty(key));
		
		
	}

}
