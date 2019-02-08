import java.util.Random;
public class sample 
{

	public static void main(String[] args) 
	{
       Random rand = new Random();
     	int startScan;  // Starting position of the scan
   		int index;      // To hold a subscript value
   		int minIndex;   // Element with the smallest value in the scan
   		int minValue;   // The smallest value found in the scan
     
       int number[] = new int[10];
       
       for(int i = 0; i < number.length; i++)
       {
    	    number[i] = rand.nextInt(100) + 1;
       }
       
		
		for(startScan = 0; startScan < (number.length - 1); startScan++)
		{
			minIndex = startScan;
			minValue = number[startScan];
			
			for(index = startScan + 1; index < number.length; index++)
			{
				if(number[index] < minValue)
				{
					minValue = number[index];
					minIndex = index;
				}
			}
			
			number[minIndex] = number[startScan];
			number[startScan] = minValue;
		}
		
		for(int i = 0, j = 0; i < 10; i++, j++)
		{
			if(i % 2 == 0)
				System.out.print(number[i] + " , ");
			if(i % 2 != 0)
				System.out.println(number[i]);
			
		}
           

	}

}
