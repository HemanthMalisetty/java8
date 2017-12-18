package com.sapient.client;

import com.sapient.services.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		NokiaLumia lumia=new NokiaLumia();
		lumia.doConversation();
		lumia.sendSms();
		lumia.captureImage();
		lumia.browseNet();

	}

}
