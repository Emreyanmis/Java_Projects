public class CarClassDemo 
{
	public static void main(String[] args) 
	{
        CarClass car = new CarClass(1964, 0,  "Aston Martin");
  
           
        System.out.println("You have a " + car.getYearModel() + " " + car.getMake() + ", Speed = "
        					+ car.getSpeed() + " mph");

        for(int i = 0; i < 5; i++)
        {
        		car.accelerate();
        		System.out.println("\nAccelerate:\nYou have a " + car.getYearModel() + " " + car.getMake() 
        							+ ", Speed = "+ car.getSpeed() + " mph");
        }
        
        
        for(int i = 0; i < 5; i++)
        {
        		car.breakk();
        		System.out.println("\nBrake:\nYou have a " + car.getYearModel() + " " + car.getMake() 
        							+", Speed = "+ car.getSpeed() + " mph");
        }   
	}
}
