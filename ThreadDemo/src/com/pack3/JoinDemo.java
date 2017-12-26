package com.pack3;

import com.pack1.MyThread;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		t1.setName("ram");
//		t1.setPriority(10);
//		t1.setPriority(Thread.MAX_PRIORITY);
		
		MyThread t2 = new MyThread();
		t2.setName("tom");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		for(int i=1; i<=200;++i){
			System.out.println(Thread.currentThread().getName() 
					+ " " + (i * 5));
		}
		System.out.println("main thread complete....");
	}

}
