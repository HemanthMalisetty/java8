package com.sapient.client;

public class TestDemo {

	public static void main(String[] args) {
		Test t=new Test();

	}

}

class Test{
	public Test(){
		this((byte)4);
	}

	public Test(byte i) {
		System.out.println(i);
	}
	
}
