package com.epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Construction_cost 
{
	private static final Logger logg = LogManager.getLogger(Construction_cost.class);
	
	public double cost(char standard,double area,char automation)
	{
		logg.info("entered into cost method");
		
		double house_cost = 0;
		
		if(automation == 'N')
		{
		if(standard == 'S')
		{	
			house_cost = area*1200;
		}
		else if(standard == 'A')
		{
			house_cost = area*1500;
		}
		else if(standard == 'H')
		{
			house_cost = 1800*area;
		}
	}
		else if(standard == 'H'&& automation == 'Y')
		{
			house_cost = area*2500;
		}
		logg.info("exited the cost method");
		
return house_cost;
}
}
