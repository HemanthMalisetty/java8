package com.sapient.util;

import java.util.ResourceBundle;

public class Factory {
	public static final String DRIVER;
	public static final String URL;
	public static final String USERNAME;
	public static final String PASSWORD;
	
	static{
		ResourceBundle rb=ResourceBundle.getBundle("database");
		DRIVER= rb.getString("driver");
		URL=rb.getString("url");
		USERNAME=rb.getString("username");
		PASSWORD=rb.getString("password");
	}
}
