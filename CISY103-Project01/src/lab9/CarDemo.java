package lab9;

public class CarDemo 
{
	public static void main(String[] args) 
	{
		// Create a car object by the name of car1
        Car car1 = new Car(1964, 0,  "Aston Martin");
          
        System.out.println("You have a " + car1.getYearModel() + " " + car1.getMake() + ", Speed = "
        					+ car1.getSpeed() + " mph");

        for(int i = 0; i < 5; i++)
        {
        		car1.accelerate();
        		System.out.println("\nAccelerate:\nYou have a " + car1.getYearModel() + " " + car1.getMake() 
        							+ ", Speed = "+ car1.getSpeed() + " mph");
        }        
        for(int i = 0; i < 5; i++)
        {
        		car1.breakk();
        		System.out.println("\nBrake:\nYou have a " + car1.getYearModel() + " " + car1.getMake() 
        							+", Speed = "+ car1.getSpeed() + " mph");
        }   
	}
}