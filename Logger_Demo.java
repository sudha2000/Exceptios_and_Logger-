package com.logging.logger;

public class Logger_Demo {
	public double total_cost(int number ,int automatecost,float sqfeet)
	{
		return (number+automatecost)*sqfeet;
	}
	public int automated(int flag1)
	{
		
		int cost;
		if(flag1>0)
		{
			 cost=700;
		}
		else
			cost=0;
		return cost;	
	}
}
