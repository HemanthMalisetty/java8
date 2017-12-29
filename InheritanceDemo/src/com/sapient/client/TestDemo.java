package com.sapient.client;

public class TestDemo {

	public static void main(String[] args) {
		B b1=new B();
	}

}


class A{
	static{
		System.out.println("STATIC A");
	}
	
	{
		System.out.println("instancec a");
	}
	A(){
		System.out.println("Contructor A");
	}
}

class B extends A{
	static{
		System.out.println("STATIC B");
	}
	
	{
		System.out.println("instancec B");
	}
	B(){
		
		System.out.println("Contructor B");
	}
}
