
public class SequentialSearchArray 
{

	public static void main(String[] args)
	{
		int[] scores = { 64, 65, 45,40 ,99 };
		int results;
		
		results = sequentialSearch(scores , 99);
		
		if(results == -1 )
			System.out.println("You did not earn a 99 on any test. ");
		else
			System.out.println("You earned a 99 on the test " + (results + 1));
		

	}

	private static int sequentialSearch(int scores [] ,int  n)
	{ 
		int i = 0;
		int element = -1;
		boolean found = false;
		
		while(!false && i < scores.length)
		{
			if(scores[i] == n)
			{
				found = true;
				element = i;
			}	
			i++;		
		}
		return element;
	}
}
