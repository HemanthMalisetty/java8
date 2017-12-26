package com.pack2;

public class RunnableClient {

	public static void main(String[] args) {
//		MyRunnable r1=new MyRunnable();
		
		Runnable r2=()->{
			for(int i=1;i<=1000;i++){
				System.out.println(Thread.currentThread().getName()+ " " + (i*5));
			}
		};
		Thread t1=new Thread(r2);
		t1.setName("ram");
		
		Thread t2=new Thread(r2);
		t1.setName("tom");
		
		
		t1.start();
		t2.start();
		
		System.out.println("Main over");

	}

}
