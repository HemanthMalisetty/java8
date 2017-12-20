package com.sapient.service;

public interface Basic {
	String convert2Binary(int num);
	public default int doSum(int ...a){
		int sum=0;
		
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	
	public default double doAverage(int ...a){
			int sum=0;
			double avg=0;
		
		for (int i : a) {
			sum+=i;
		}
		avg=sum/a.length;
		return avg;
	}
}
