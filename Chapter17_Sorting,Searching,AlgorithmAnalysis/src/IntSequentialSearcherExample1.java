
public class IntSequentialSearcherExample1 
{

	public static int search(int[] array, int value)
	{
		int index = 0;
		int position = -1;
		boolean found = false;
		
		while(!found && index < array.length)
		{
			if(array[index] == value)
			{
				found = true;
				position = index;
						
			}
			index++;
		}
		return position;
	}
}
