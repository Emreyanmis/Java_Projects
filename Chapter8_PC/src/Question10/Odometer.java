package Question10;

public class Odometer 
{
     private int currentMilage;
     private FuelGauge fuelGauge;
     
     
     /**
	 * @return the currentMilage
	 */
	public int getCurrentMilage() 
	{
		return currentMilage;
	}

	/**
	 * @param currentMilage the currentMilage to set
	 */
	public void setCurrentMilage(int currentMilage) 
	{
		this.currentMilage = currentMilage;
	}

	public Odometer(int currentMilage)
     {
    	 this.currentMilage = currentMilage;

    	 
    	 setCurrentMilage(currentMilage);
     }
     
     public void add()
     {
    	 if(currentMilage < 999)
    		 currentMilage += 1;
    	 else if(currentMilage > 999)
    		 currentMilage = 0;
     }
     
 
   
     
}
