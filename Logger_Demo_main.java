package com.logging.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Logger_Demo_main extends Logger_Demo{

	Scanner sc=new Scanner(System.in);
	public static final Logger LOGGER=LogManager.getLogger(Logger_Demo.class);
	public static void main(String args[])
	{
		Logger_Demo constructor=new Logger_Demo();
		try (Scanner sc = new Scanner(System.in)) {
			LOGGER.info("Enter standards for the  materials\n1.normal standard\n2.above standards \n3.high standards \n4.high standards and fully automated house");
			int s=sc.nextInt();
			LOGGER.info("Enter the area for house");
			float area=sc.nextInt();
			int cost;
			float housecost;
			int flag1;
			switch(s)
			{
				case 1: LOGGER.info("Enter if you need a fully automated house");
						flag1=sc.nextInt();
						cost=constructor.automated(flag1);
						housecost=(float) constructor.total_cost(1200,cost,area);
						LOGGER.info("Construction cost of house is "+housecost);
						break;
				case 2:LOGGER.info("Enter if you need a fully automated house");
						flag1=sc.nextInt();
						cost=constructor.automated(flag1);
						housecost=(float) constructor.total_cost(1500,cost,area);
						LOGGER.info("Construction cost of house is "+housecost);
						break;
				case 3:LOGGER.info("Enter if you need a fully automated house");
					   flag1=sc.nextInt();
					   cost=constructor.automated(flag1);
					   housecost=(float)constructor.total_cost(1800,cost,area);
					   LOGGER.info("Construction cost of house is "+housecost);
					   break;
				case 4:
					   housecost=2500*area;
					   LOGGER.info("Construction cost of house is "+housecost);
					   break;
				default:return;
						
					   
			}
		}
	}


}
