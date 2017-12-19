package com.sapient.services;

public abstract class Product {
	private int productId;
	private String productName;
	private double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void display() {
		System.out.printf("%10d%20s%10.2f", productId, productName,productPrice);
	}
	public abstract String isExpensive();
}
