// Programmer Halis Emre Yanmis
// Project 2

import java.text.DecimalFormat;

public class LandscapingService 
{
	
	private char serviceLevel;
	private double acreage;
	
	/**
	     This constructor initializes the parameters newServiceLevel and newAcreage
	     @param1	newServiceLevel  the service level of the landscaping work
	     @param2	newAcreage   the number of acres of land is landscaped
	**/
	
	public LandscapingService (char newServiceLevel, double newAcreage)
	{
		serviceLevel = newServiceLevel;
		acreage = newAcreage;
	}
	
	
	/**
	    The method returns to acreage.
	    @return  acreage returns the value of the acreage
	**/
	
	public double getAcreage()
	{
		return acreage;
	}
	
	/**
	    The method returns the service level
	    @return  serviceLevel returns the value of the service level
	**/
	
	public char getServiceLevel()
	{
		return serviceLevel;
	}
	
	/**
	    The method sets the acreage
	    @param   newAcreage the value of acreage
	**/
	
	public void setAcreage (double newAcreage)
	{
		acreage = newAcreage;
	}
	
	/**
	   The method sets the service level
	   @param   newServiceLevel  the level service
	**/
	
	public void setServiceLevel (char newServiceLevel)
	{
		serviceLevel = newServiceLevel;
	}
	
	/**
	    This method finds the costs of landscaping service
	    @return   cost   cost of the landscaping service
	**/
	
	public double cost()
	{
	double cost = 0;

	if (serviceLevel == 'S' || serviceLevel == 's')
	{
	cost = acreage * 9865.34;
	}

	else if (serviceLevel == 'P' || serviceLevel == 'p')
	{
	if (acreage <= 1)
	{
	cost = 15975.75 * acreage;
	}
	else
	{
	cost = 15975.75 + (21999.98 * (acreage - 1));
	}
	}

	return cost;
	}

	/**
	    The method converts objects of service level and acreage to strings
	    @return   String toString   returns the string form of object
	**/
	
	public String toString()
	{
		DecimalFormat moneyFormat = new DecimalFormat("0.00");
		String stringToReturn;

	    if (serviceLevel == 'S' || serviceLevel == 's')
			stringToReturn = "";
	    else if (serviceLevel == 'P' || serviceLevel == 'p')
			stringToReturn = "";

		stringToReturn = "[" + serviceLevel + "," + acreage + "]";




	  return stringToReturn;
	}
}
