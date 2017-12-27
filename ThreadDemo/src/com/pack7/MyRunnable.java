package com.pack7;

public class MyRunnable implements Runnable{
	private String name;
	
	public MyRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=500;i++){
			System.out.println(name+ "\texecutiong: "+ i);
		}
		
		System.out.println("\n"+name);
	}

}
