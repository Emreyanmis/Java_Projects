import java.util.Random;

public class EvenOddCounter 
{

	public static void main(String[] args) 
	{
		Random randomNumbers = new Random();
		
		int numbers = randomNumbers.nextInt(100);
		
		for(int i = 0; i < numbers; i++)
		{
			isEven(numbers);	
			
			if(isEven(numbers) == true)
				System.out.println(numbers + " is even.");
			else 
				System.out.println(numbers + " is odd.");
		}

	}
	
	public static boolean isEven (int number)
	{
		
		if ((number % 2) == 0)
			return true;
		else
			return false;			
	}

}
