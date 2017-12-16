package com.sapient.services;

public class Interest {
		public double amount;
		public int years;
		public float rate;
		
		
		public  double simpleInterest(){
			double si=amount*years*rate/100;
			return si;
		}
		public  double compoundInterest(){
			double ci=amount*Math.pow(1+rate/100, years)-amount;
			return ci;
		}
}
