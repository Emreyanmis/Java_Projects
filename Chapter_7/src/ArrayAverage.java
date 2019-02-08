
public class ArrayAverage
{

	public static void main(String[] args) 
	{
		int [] scores = {2,3,4,0,5,6,7,8};
		
		int total = 0; // Initialize the accumulator
	
		// Calculates the total value of the array
		for(int i = 0 ; i < scores.length; i++)
		{
			total += scores[i];
		}	
		
		// Displays the total value of the array
		System.out.println("The total is:" + total);	

		
        int average = 0;  // Initialize the accumulator
		
        // Calculates the average value of the array
		for(int i = 0; i < scores.length; i++)
		{
			total += scores[i];
			average = total / scores.length;
		}
         
		// Displays the average value of the array
		System.out.println(average);
		
		
		int highest = scores[0];  // Initialize the accumulator
		
		// Calculates the highest value of the array
		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i] > highest)
			  highest = scores[i];	
		}
		
		// Displays the highest value of the array
		System.out.println(highest);
		
         
		int lowest = scores[0];  // Initialize the accumulator
		
		// Calculates the lowest value of the array
		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i] < lowest)
			  lowest = scores[i];	
		}
		
		// Displays the lowest value of the array
		 System.out.println(lowest);
		
		 int highestLocation = scores[0];
		 
		 for(int i = 0; i < scores.length; i++)
			{
				if(scores[i] > highestLocation)
				  highestLocation = i;	
			}
		 
		 System.out.println("highest location: " + (highestLocation + 1));
		 
		 
		 int lowestLocation = scores[0];
		 for(int i = 0; i < scores.length; i++)
			{
				if(scores[i] < lowestLocation)
					lowestLocation = i;	
			}
		 
		 System.out.println("lowest location: " + (lowestLocation + 1));
		
	}

}
