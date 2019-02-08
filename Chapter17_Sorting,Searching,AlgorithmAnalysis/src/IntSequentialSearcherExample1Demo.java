
public class IntSequentialSearcherExample1Demo 
{

	public static void main(String[] args)
	{
		int[] scores = { 23, 5345, 532, 35, 54, 100, 31};
		int results;
		
		results = IntSequentialSearcherExample1.search(scores, 31);
		
		if(results == -1)
			System.out.println("You did not earn 31 on any test.");
		else
			System.out.println("You earned 31 on test " + (results + 1));
			
		

	}

}
