package com.sapient.service;

public class Employee {
	private String name;
	private int age;
	private String businessUnit="RazorFish";
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name.matches("[]2-zA-Z){3,15}")){
			throw new Exception("Name must contain 3-15 alphabets");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) throws Exception {
		if(i < 18 || i > 60 ){
			throw new Exception("Age must be between 18 and 60");
		}
		this.age = i;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	
	
	
}
