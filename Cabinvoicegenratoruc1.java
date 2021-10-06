package com.cabInvoiceGenrator;

public class Cabinvoicegenratoruc1 {

	public static final double MINIMUM_COST_KILOMETER = 10.0;
	public static final int COST_PER_TIME =1;
	public static final int MINIMUM_FARE = 5;
	public double calculteFare(double distance,int time )
	{
		double totalFare = distance * MINIMUM_COST_KILOMETER + time * COST_PER_TIME;
		if (totalFare<MINIMUM_FARE)
		{
			return MINIMUM_FARE;
		
		}
		else
		{
			return totalFare;
		}
	}
