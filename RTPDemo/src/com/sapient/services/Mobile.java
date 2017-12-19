package com.sapient.services;

public class Mobile extends Product{
	private String  camPix;;
	public Mobile(int productId, String productName, double productPrice,String camPix) {
		super(productId, productName, productPrice);
		this.camPix=camPix;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String isExpensive() {
		double price=getProductPrice();
		String res=null;
		if(price>=10000)
			res="expensive";
			else if(price>=5000)
				res="average";
		res="cheap";
		return res;
	}



	@Override
	public void display() {
		super.display();
		System.out.printf("%20s%20s%20s\n",camPix,isExpensive(),getClass().getSimpleName());
		
	}

}
