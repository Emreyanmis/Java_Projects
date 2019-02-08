
public class CarClassDemo 
{

	public static void main(String[] args) 
	{
        CarClass car = new CarClass(0,0,null);
        
        for(int i = 0; i < 5; i++)
        {
        		car.accelerate();
        }
        
        System.out.println("The current speed of the car is: " + car.getSpeed() + " mph.\n");
        
        
        for(int i = 0; i < 5; i++)
        {
        		car.breakk();
        }
        
        System.out.println("The current speed of the car is: " + car.getSpeed() + " mph.\n");
        
	}

}
