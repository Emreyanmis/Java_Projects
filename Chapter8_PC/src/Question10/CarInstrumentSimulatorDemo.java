package Question10;

public class CarInstrumentSimulatorDemo 
{

	public static void main(String[] args)
	{
		FuelGauge demo1 = new FuelGauge(15);
		Odometer demo2 = new Odometer(100);
		
	
		 
	

		while(demo1.getCurrentFuel() > 0)
		{	
			System.out.println("Current milage: " + demo2.getCurrentMilage());
			 if(demo2.getCurrentMilage() % 24 == 0)	  
	    		 demo1.decrease();
			
		    demo2.add();
		    System.out.println("Amount of fuel: " + demo1.getCurrentFuel() + "\n");
	
		}	
		
		
	}

}
