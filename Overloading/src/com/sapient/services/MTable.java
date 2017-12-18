package com.sapient.services;

public class MTable {
	private int number;

	public MTable(int number) throws Exception {
		super();
		if(number<0)
			throw new Exception("Number must not be greater than zero");
		
		this.number = number;
	}
	
	public void display(){
		
		showTAble(1, 10);
		
	}
	
	public void display(int rows){
		showTAble(1, rows);

	}
	
	public void display(int startRow,int endRow) throws Exception{
		if(startRow > endRow)
			throw new Exception("end row must not be less than start row");
		showTAble(startRow, endRow);
	}
	
	private void showTAble(int startRow,int endRow){
		for(int i=startRow;i<=endRow;i++){
			System.out.printf("%d * %d = %d \n", number ,i,(number*i));

		}
	}
	
	
	/*
	public void display(){
		for(int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d \n", number ,i,(number*i));

		}
	}
	
	public void display(int rows){
		for(int i=1;i<=rows;i++){
			System.out.printf("%d * %d = %d \n", number ,i,(number*i));

		}
	}
	
	public void display(int startRow,int endRow){
		for(int i=startRow;i<=endRow;i++){
			System.out.printf("%d * %d = %d \n", number ,i,(number*i));

		}
	}
	*/

	
}
