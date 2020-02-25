package com.epam;

import org.junit.Assert;
import org.junit.Test;

public class Interest_test {

	@Test
	public void test() 
	{
		Interest test_interest = new Interest();
		Assert.assertEquals(16288.946267774416,test_interest.simple_interest(10000,10.25,5),0.1);
		Assert.assertEquals(1333.099243,test_interest.compound_interest(1200,5.4,2),0.1);
	}
}