package com.cabInvoiceGenrator;

import org.junit.Test;

import com.sun.tools.javac.util.Assert;

public class InvoiceServiceTest {
@Test
public  void giveDistanceAndTime_ShouldReturnTotalFare()
{
	Cabinvoicegenratoruc1 cabinvoicegenrator = new Cabinvoicegenratoruc1();
	double distance = 2.0;
	int time = 5;
	double fare = cabinvoicegenrator.calculteFare(distance, time);
	Assert.assertEquals(25 , fare ,0.0) ;

	@Test
	public void givenDistanceAndTime_ShouldReturnMinimumFare()
	{
		Cabinvoicegenratoruc1 invoiceGenerator = new Cabinvoicegenratoruc1();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculteFare(distance , time);
		Assert.assertEquals(5 , fare ,0.0);
	}
}
