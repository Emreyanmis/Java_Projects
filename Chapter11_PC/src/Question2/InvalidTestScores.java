package Question2;

public class InvalidTestScores extends Exception
{
	public InvalidTestScores(int array)
	{
		 super("Error!: test scores cannot be less than 0 or "
		 		+ "greater than 100" );
	}

}
