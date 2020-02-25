package com.epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
	
	private static final Logger logg = LogManager.getLogger(Construction_cost.class);
	
	public double compound_interest(double principle_amount,double rate,double time)
	{
		logg.info("entered compound_interest function");
		double total_interest;
		total_interest = principle_amount*Math.pow((1+rate/100),time);
		logg.info("exited compound_interest function");
		return total_interest;
	}
	public double simple_interest(double principle_amount,double rate,double time)
	{
		logg.info("entered simple_interest function");
		double total_interest;
		total_interest = (principle_amount*rate*time)/100;
		logg.info("exited simple_interest function");
		return total_interest;
	}
}