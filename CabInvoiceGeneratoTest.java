package com.cabinvoicGenerator;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGenerator {
	@Test
	public void givenDistanceandTime_ShouldReturnTotalfareForMultipleRide()
	{
	  CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
	  Ride [] rides = {new Ride ( 2.0 ,  5),
			           new Ride ( 0.1 , 1)};
	  double totalfare = invoiceGenerator.calculateTotalFare(rides);
	  Assert.assertEquals(30 , totalfare, 0.0);
	 }
	 	
}
	
