package com.sapient.vo;

import java.util.List;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	private List<String> specList;
	public List<String> getSpecList() {
		return specList;
	}
	public void setSpecList(List<String> specList) {
		this.specList = specList;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	@Override
	public boolean equals(Object obj) {
		Product product=(Product) obj;
		return this.productId==product.productId && this.productName.equals(product.productName)
				&& this.productPrice == product.productPrice && this.specList.equals(product.specList);
	}
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
}
