package com.sapient.service;

public interface Interest extends Basic{
	double calSimpleInterest(double amt,int years,float rate);
	double calCompoundInterest(double amt,int years,float rate);
}
