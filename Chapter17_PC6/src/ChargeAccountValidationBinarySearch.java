
public class ChargeAccountValidationBinarySearch
{
	public static int searchNumbers(int[] array, int chargeAccountNumber)
	{
		
	
		int first = 0, last = array.length - 1, middle, position = -1;
		boolean found = false;
		
		while(!found && first <= last)
		{
			middle = (first + last) / 2;
			
			if(array[middle]  == chargeAccountNumber)
			{
				found = true;
				position = middle;
			}
			else if(array[middle] > chargeAccountNumber)
				last = middle - 1;
			else
				first = middle + 1;
		}	
		return position;
	}	
}
