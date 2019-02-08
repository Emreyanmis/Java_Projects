import java.util.Scanner;

public class DriverExamDemo 
{

	public static void main(String[] args)
	{
	   Scanner keyboard = new Scanner(System.in);
	   
	   // Create an array for students' answers
	   String[] userAnswers = new String[20];
	   String answer;
	   
	   // prompt the user to enter 20 answers(A/B/C/D)
	   // for the multiple choice questions
	   System.out.println("Please enter 20 answers (A/B/C/D) for the multiple choice questions. ");
       for(int i = 0; i < 20;i++)
       {
    	      do
    	      {
    	    	    System.out.print("Answer #" +(i + 1) + " :");
    	    	    answer = keyboard.nextLine();
    	      }
    	      while(!answer.equalsIgnoreCase("A") &&!answer.equalsIgnoreCase("B") && 
    	    		  !answer.equalsIgnoreCase("C") &&!answer.equalsIgnoreCase("D"));
    	      
    	      userAnswers[i] = answer;
       }
       
       DriverExam driverExam = new DriverExam(userAnswers);
       
       // Display the results
       System.out.println("\nResults...");
       
       //Display the number of correct answers
       System.out.println("Number of correct answers: " + driverExam.totalCorrect());
       
       //Display the number of incorrect answers
       System.out.println("Number of incorrect answers: " + driverExam.totalIncorrect());
       
       //Display the result of the student's driver exam
       if(driverExam.passed())
    	   		System.out.println(" Congragulations! The student has PASSED the exam");
       else
    	   		System.out.println(" Sorry! The student has FAILED the exam");
       
       // Display the question numbers of the missed answers
       if(driverExam.totalIncorrect() > 0)
       {
    	     int[] missed = driverExam.questionsMissed();
    	     System.out.println("Missed questions:");
    	     
    	     for(int i = 0; i < driverExam.totalIncorrect(); i++)
    	     {
    	    	 System.out.println(" " + missed[i]);
    	     }
    	     System.out.println(); 	    	 
       }
	}
}
