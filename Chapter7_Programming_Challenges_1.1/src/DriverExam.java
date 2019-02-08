public class DriverExam 
{
	 // Create an array for correct answers
	private String[] correctAnswers = {"B","D","A","A","C",
			                           "A","B","A","C","D",
			                           "B","C","D","A","D",
			                           "C","C","B","D","A"};
	
	// Create an array for students' answers
	private String[] studentsAnswers;
	
	// Default constructor implementation
	public DriverExam()
	{
		studentsAnswers = new String[20];
		
		for(int i = 0; i < 20; i++)
		{
			studentsAnswers[i] = "";
			
		}		
	}
	
    // parameterized constructor implementation
	public DriverExam(String[] userAnswers)
	{
		studentsAnswers = new String[userAnswers.length];
	
	
	    for(int i = 0; i < userAnswers.length;i++)
	     {
	      	studentsAnswers[i] = userAnswers[i];
	     }
	}
	
	// passed method implementation
	// It returns true if the student passed the exam
	// or false otherwise
	public boolean passed()
	{
		// Verify that student answered 15 questions or more correctly
		if(totalCorrect() >= 15)
			return true;
		else
			return false;		
	}
	
	// totalCorret method implementation 
	// It returns the total number of correct answers
	public int totalCorrect()
	{
		int correct = 0;
		
		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(studentsAnswers[i].equalsIgnoreCase(correctAnswers[i]))
			{
				correct++;
			}
		}

	  return  correct;
	}
	
	// totalIncorrect method implementation
	// It returns the total incorrectly answered questions.
	public int totalIncorrect()
	{
		int incorrect = 0;
		
		for(int i = 0; i < correctAnswers.length;i++)
		{
			if(!studentsAnswers[i].equalsIgnoreCase(correctAnswers[i]))
			{
				incorrect++;
			}
		}
		
		return incorrect;
	}
	
	//questionsMissed method implementation
	// It returns an array that contains the number of incorrect answers
	public int[] questionsMissed()
	{
		int missedCount = totalIncorrect();
		int[] missed = new int[missedCount];
		
		for(int i = 0, j = 0; i < correctAnswers.length;i++)
		{
			if(!studentsAnswers[i].equalsIgnoreCase(correctAnswers[i]))
			{
				missed[j] = (i + 1);
				j++;
			}
		}
		
		return missed;		
	}
}