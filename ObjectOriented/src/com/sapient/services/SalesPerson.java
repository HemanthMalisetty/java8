package com.sapient.services;

public class SalesPerson {
	public int id;
	public String name;
	public double salesAmount;
	public static double totalSales;
	public static int totalPerson;

	public double calculateSalesCommision() {
		double sc = 0;
		if (salesAmount >= 50000)
			sc = 50000 * 0.1;
		else if (salesAmount >= 20000)
			return sc = 20000 * 0.05;
		else
			sc = 20000 * 0.03;
		return sc;
	}

	public SalesPerson(int id, String name, double salesAmount) {
		super();
		this.id = id;
		this.name = name;
		this.salesAmount = salesAmount;
		totalSales+=this.salesAmount;
		++totalPerson;
	}
	
	public void display() {
		System.out.println("ID"+ "	Name" + "	Sales Amount"+ "	Calculated sales amount");
		System.out.println(id+"	"+ name+ "	"+ salesAmount+"		"+ calculateSalesCommision());
	}

}
