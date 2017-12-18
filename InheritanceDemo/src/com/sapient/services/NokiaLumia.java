package com.sapient.services;

public class NokiaLumia extends Nokia1100{
	public void captureImage() {
		
		System.out.println("Capture Image");
	}
	
	public void browseNet() {
		System.out.println("Browse net");
	}

	@Override
	public void doConversation() {
		System.out.println("Do conversation in 5G");
		
	}
	
	
}
