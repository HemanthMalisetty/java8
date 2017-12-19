package com.sapient.services;

public class Computer extends Product{
	private String hdd;

	public Computer(int productId, String productName, double productPrice, String hdd) {
		super(productId, productName, productPrice);
		this.hdd = hdd;
	}

	@Override
	public String isExpensive() {
		double price=getProductPrice();
		String res=null;
		if(price>=50000)
			res="expensive";
			else if(price>=30000)
				res="average";
		res="cheap";
		return res;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10s%30s%20s\n",hdd,isExpensive(),getClass().getSimpleName());
	}
	
}
