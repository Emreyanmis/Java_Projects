package lab9;

public class Car
{
   private int yearModel;
   private int speed;
   private String make;
   

   public Car(int model, int s, String m)
   {
	   yearModel = model;
	   speed = s;
	   make = m;
   }
  
   public int getYearModel() 
   {
	   return yearModel;
   }

   public void setYearModel(int yearModel) 
   {
	   this.yearModel = yearModel;
   }

   public int getSpeed() 
   {
	return speed;
   }

   public void setSpeed(int speed) 
   {
   		this.speed = speed;
   }

   public String getMake() 
   {
   	    return make;
   }

   public void setMake(String make)
   {
    	this.make = make;
   }
   	
   public int accelerate()
   {	
   	 return speed = speed + 5;
   }
   	
   public int breakk()
   {
	 if (speed > 0) 
		 speed = speed - 5;
	return speed;
   }
   	  
}
