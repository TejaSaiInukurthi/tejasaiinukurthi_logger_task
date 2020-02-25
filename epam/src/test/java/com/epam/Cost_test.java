package com.epam;

import org.junit.Assert;
import org.junit.Test;


public class Cost_test {

	@Test
	public void test() {
		
		Construction_cost c_cost = new Construction_cost();
		Assert.assertEquals(0.0,c_cost.cost('A',15.2,'Y'), 0.1);
		Assert.assertEquals(57450.0,c_cost.cost('H',22.98,'Y'), 0.1);
		Assert.assertEquals(20250.0,c_cost.cost('A',13.5,'N'), 0.1);
	}

}