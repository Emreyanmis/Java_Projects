package Question10;

public class FuelGauge
{
   private int currentFuel;
   
   public FuelGauge(int currentFuel)
   {
	   this.currentFuel = currentFuel;
	   setCurrentFuel(currentFuel);
   }
   
   public FuelGauge(FuelGauge object2)
   {
	   this.currentFuel = object2.currentFuel;
   }
   
   public void setCurrentFuel(int currentFuel)
   {
	   this.currentFuel = currentFuel;
   }
   
   public int getCurrentFuel()
   {
	   return currentFuel;
   }
   
   public void add()
   {
	   if(currentFuel < 15)
		   currentFuel =  currentFuel + 1;
   }
   
   public void decrease()
   {
	   if(currentFuel > 0)
		   currentFuel = currentFuel- 1;
   }
   
  
   
   
   public String toString()
   {
	   return "Current amount of fuel(in gallons): " + this.currentFuel;
   }
   
   
}
