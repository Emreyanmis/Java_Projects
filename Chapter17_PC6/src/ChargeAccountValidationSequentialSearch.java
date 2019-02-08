
public class ChargeAccountValidationSequentialSearch 
{ 
	public static boolean searchNumbers(int chargeAccountNumber)
	{
		int[] accountNumbers = {565884, 4520125, 7895122 , 8777541, 8451277,
				                1302850, 8080152, 4562555, 5552012, 5050552,
				                7825877,1250255, 1005231, 6545231, 3852085,
				                7576651,7881200,4581002};
		
		int index = 0;
		int position = -1;
		boolean found = false;
		
		while(!found && index < accountNumbers.length)
		{
			if(accountNumbers[index] == chargeAccountNumber)
			{
				found = true;
				position = index;
			}
			index++;
		}
		
		if(position == -1)
			found = false;
		else
			found = true;
		
		return found;
		
	}
	
	
}
