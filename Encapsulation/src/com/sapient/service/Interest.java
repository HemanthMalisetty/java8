package com.sapient.service;

public class Interest {
		private double amount;
		private int years;
		private float rate;
		
		
		
		public Interest(double amount, int years, float rate) throws Exception {
			super();
			if(amount<5000)
				throw new Exception("Amount should not be less than 5000");
			this.amount = amount;
			if(years<0 || years >30)
				throw new Exception("Time should be between 0 to 30");
			this.years = years;
			if(rate<0 || rate >1)
				throw new Exception("Rate should be between 0 to 1");
			this.rate = rate;
		}
		public  double simpleInterest(){
			double si=amount*years*rate/100;
			return si;
		}
		public  double compoundInterest(){
			double ci=amount*Math.pow(1+rate/100, years)-amount;
			return ci;
		}
}
