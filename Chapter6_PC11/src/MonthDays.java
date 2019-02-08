
public class MonthDays 
{
   private int month;
   private int year;
   
   public MonthDays(int month, int year) 
   {
	this.month = month;
	this.year = year;
   }

	/**
	 * @return the month
	 */
	public int getMonth() 
	{
		return month;
	}
	
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) 
	{
		this.month = month;
	}
	
	/**
	 * @return the year
	 */
	public int getYear()
	{
		return year;
	}
	
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public int getNumberOfDays()
	{
	    int numDays = 30;
	    
	    if(year % 100 == 0)
	    {
	    	  if(year % 400 == 0)
	    	  {
	    		  if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
	    		  {
	    			  numDays = 31;
	    		      return numDays;	
	    		  }
	    		  
	    		  else if ( month == 2)
	    		  {
	    			  numDays = 29;
	    		      return numDays;	
	    		  }
	    		  else
	    		  {	  
	    			 numDays = 30;  	
	    		      return numDays;	
	    		  }	 
	    	  }
	    	
	    }
	    else if(year % 100 !=  0)
	    {
	    		if(year % 4 == 0)
	    		{
		    		  if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		    		  {
		    			  numDays = 31;
		    		      return numDays;	
		    		  }
		    		  
		    		  else if ( month == 2)
		    		  {
		    			  numDays = 29;
		    		      return numDays;	
		    		  }
		    		  else
		    		  {	  
		    			 numDays = 30;  
		    		     return numDays;	
		    		  }	 
		    	  }	
	    			
	    }
	    else 
	    {
	    		numDays = 30;	
	        return numDays;	
	    }
	       return numDays;	
        
	}   
   
   
   
	
}
