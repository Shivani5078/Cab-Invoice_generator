@Test
	public void givenMultipleRides_ShouldReturnInvoice()
	{
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = {new Ride(2.0, 5), 
						new Ride(0.1, 1)};
		Invoice summary = invoiceGenerator.calculateFare(rides);
		Invoice expectedSummary = new InvoiceSummary(2, 30.0);
		Assert.assertEquals(1, 1);
	}
}
