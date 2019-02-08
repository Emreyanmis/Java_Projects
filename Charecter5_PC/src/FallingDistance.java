
public class FallingDistance 
{

	public static void main(String[] args) 
	{
		int time;
		
	    for(int i = 1; i <=  10; i ++)
	    {   
	    	    System.out.println("At "  + i + " seconds, the falling distance in meters is: " + fallingDistance(i) 
	    	         + " meters." );
	    }	    
	}
	
	public static double fallingDistance(int time)
	{
		double distance;
		double gravity;
		gravity = 9.8;
			
		distance = 0.5 * gravity * time * time;
		
		return distance;
	}

}
